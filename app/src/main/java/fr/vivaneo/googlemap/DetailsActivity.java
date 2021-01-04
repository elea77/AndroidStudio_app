package fr.vivaneo.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import fr.vivaneo.googlemap.models.market.Fields;

public class DetailsActivity extends AppActivity {

    private TextView textViewTitle;

    private Fields item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textViewTitle = findViewById(R.id.textViewTitle);

        // récupération de l'objet
        if(getIntent().getExtras() != null) {

            item = (Fields) getIntent().getExtras().get("object");

            textViewTitle.setText(item.getLocalisation());
        }
    }
}