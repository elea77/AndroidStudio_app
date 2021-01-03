package fr.vivaneo.googlemap;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.vivaneo.googlemap.models.market.ApiMarket;
import fr.vivaneo.googlemap.models.market.Fields;
import fr.vivaneo.googlemap.models.market.Records;

public class ListingActivity extends AppActivity {

    private ListView listViewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        // récupération
        listViewData = findViewById(R.id.listViewData);
        // TODO : afficher le titre "Les Restaurants"

        //gestion de la listView
        List<Fields> fieldsList = new ArrayList<>();


        // Faire une boucle en recuperant les données de l'api

        fieldsList.add(new Fields (
                "Nom du marché" ,
                "Catégorie de produits"
        ));


        listViewData.setAdapter(
                new FieldsAdapter(
                         ListingActivity.this,
                         R.layout.item_fields,
                         fieldsList
                )
        );

        listViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Objet
                Fields item = fieldsList.get(position);

                // Intent
                Intent intentDetails = new Intent(ListingActivity.this, MenuActivity.class);

                //passage de l'objet
                intentDetails.putExtra("object", item);

                startActivity(intentDetails);
            }
        });

    }

}