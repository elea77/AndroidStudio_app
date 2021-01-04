package fr.vivaneo.googlemap;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import fr.vivaneo.googlemap.models.market.ApiMarket;
import fr.vivaneo.googlemap.utils.Constant;

public class ListingActivity extends AppActivity {

    private ListView listViewData;
    //gestion de la listView
    List<String> fieldsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        // récupération
        listViewData = findViewById(R.id.listViewData);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = Constant.URL;

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String json) {
                        Log.e("volley", json);
                        readJson(json);
                    }

                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                String json = new String(error.networkResponse.data);

                Log.e("volley", json);
            }

        });
        queue.add(stringRequest);
    }

    private void readJson(String json) {
        ApiMarket api = new Gson().fromJson(json, ApiMarket.class);


        for (int i = 0; i < api.getRecords().size(); i++) {
                //Log.e("Fields", "getName" + api.getRecords().get(i).getFields().getName());
                fieldsList.add(
                        api.getRecords().get(i).getFields().getName()+"\n"+
                        api.getRecords().get(i).getFields().getProduit()

                );

        }

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(ListingActivity.this, android.R.layout.simple_list_item_1, fieldsList);
        listViewData.setAdapter(adapter);

        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Objet
                String item = fieldsList.get(position);

                // Intent
                Intent intentDetails = new Intent(ListingActivity.this, MenuActivity.class);

                //passage de l'objet
                intentDetails.putExtra("object", item);

                startActivity(intentDetails);
            }
        });

    }
}

