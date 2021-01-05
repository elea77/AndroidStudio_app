package fr.vivaneo.googlemap;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import fr.vivaneo.googlemap.models.market.Fields;

public class DetailsActivity extends AppActivity {

    private Button buttonFav;
    private TextView textNomMarche;
    private TextView textLocalisation;
    private TextView textCategory;
    private TextView textArdt;
    private TextView textHorairesLundi;
    private TextView textHorairesMardi;
    private TextView textHorairesMercredi;
    private TextView textHorairesJeudi;
    private TextView textHorairesVendredi;
    private TextView textHorairesSamedi;
    private TextView textHorairesDimanche;

    private Fields item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        buttonFav = findViewById(R.id.buttonFav);
        textNomMarche = findViewById(R.id.textNomMarche);
        textLocalisation = findViewById(R.id.textLocalisation);
        textCategory = findViewById(R.id.textCategory);
        textArdt = findViewById(R.id.textArdt);
        textHorairesLundi = findViewById(R.id.textHorairesLundi);
        textHorairesMardi = findViewById(R.id.textHorairesMardi);
        textHorairesMercredi = findViewById(R.id.textHorairesMercredi);
        textHorairesJeudi = findViewById(R.id.textHorairesJeudi);
        textHorairesVendredi = findViewById(R.id.textHorairesVendredi);
        textHorairesSamedi = findViewById(R.id.textHorairesSamedi);
        textHorairesDimanche = findViewById(R.id.textHorairesDimanche);

        // récupération de l'objet
        if(getIntent().getExtras() != null) {

            item = (Fields) getIntent().getExtras().get("object");

                String FAVORITE_NAME = "MyFavorites";
                SharedPreferences preferences = getSharedPreferences(FAVORITE_NAME,MODE_PRIVATE);
                String valueFav = preferences.getString(item.getName(),"0");
                SharedPreferences.Editor editor = preferences.edit();

                if(valueFav == "0"){
                    buttonFav.setBackgroundResource(R.drawable.favori_blanc);
                }else{
                    buttonFav.setBackgroundResource(R.drawable.favori_noir);
                }

                textNomMarche.setText(item.getName());
                textLocalisation.setText(item.getLocalisation());
                textCategory.setText(item.getProduit());

                textArdt.setText(item.getArdt().toString()+"e");

                if(item.getLundi().intValue() == 0){
                    textHorairesLundi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesLundi.setText(horaires);
                }

                if(item.getMardi().intValue() == 0){
                    textHorairesMardi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesMardi.setText(horaires);
                }

                if(item.getMercredi().intValue() == 0){
                    textHorairesMercredi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesMercredi.setText(horaires);
                }

                if(item.getJeudi().intValue() == 0){
                    textHorairesJeudi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesJeudi.setText(horaires);
                }

                if(item.getVendredi().intValue() == 0){
                    textHorairesVendredi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesVendredi.setText(horaires);
                }

                if(item.getSamedi().intValue() == 0){
                    textHorairesSamedi.setText("Fermé");
                }else{
                    String h_deb = item.getH_deb_sem_1();
                    String h_fin = item.getH_fin_sem_1();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesSamedi.setText(horaires);
                }

                if(item.getDimanche().intValue() == 0){
                    textHorairesDimanche.setText("Fermé");
                }else {
                    String h_deb = item.getH_deb_dim();
                    String h_fin = item.getH_fin_dim();
                    String horaires = h_deb + " - " + h_fin;
                    textHorairesDimanche.setText(horaires);
                }

                buttonFav.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(valueFav == "0"){
                            editor.putString(item.getName(),"1");
                            editor.commit();

                            finish();
                            startActivity(getIntent());
                        }else{
                            editor.putString(item.getName(),"0");
                            editor.commit();

                            finish();
                            startActivity(getIntent());
                        }
                    }
                });

        }
    }
}