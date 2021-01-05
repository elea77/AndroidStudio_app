package fr.vivaneo.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import fr.vivaneo.googlemap.models.market.Fields;

public class PopupActivity extends AppActivity {

    private Button buttonDetails;
    private TextView textViewTitle;
    List<Fields> fieldsList = new ArrayList<>();
    private Fields item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        buttonDetails = findViewById(R.id.buttonDetails);
        textViewTitle = findViewById(R.id.textViewTitle);

        item = (Fields) getIntent().getExtras().get("object");

        textViewTitle.setText(item.getName());

    }

    public void close(View view) {
        Intent mapPage = new Intent(PopupActivity.this, MapsActivity.class);

        startActivity(mapPage);
    }

    public void details(View view) {

        item = (Fields) getIntent().getExtras().get("object");


        fieldsList.add(new Fields(
                item.getName(),
                item.getProduit(),
                item.getLocalisation(),
                item.getArdt(),
                item.getLundi(),
                item.getMardi(),
                item.getMercredi(),
                item.getJeudi(),
                item.getVendredi(),
                item.getSamedi(),
                item.getDimanche(),
                item.getH_deb_dim(),
                item.getH_fin_dim(),
                item.getH_deb_sem_1(),
                item.getH_fin_sem_1()
        ));


        Intent intentDetails = new Intent(PopupActivity.this, DetailsActivity.class);

        //passage de l'objet
        intentDetails.putExtra("object", item);

        startActivity(intentDetails);
    }
}