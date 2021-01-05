package fr.vivaneo.googlemap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void map(View view) {
        Intent mapPage = new Intent(MenuActivity.this, MapsActivity.class);

        startActivity(mapPage);
    }

    public void list(View view) {
        Intent listingPage = new Intent(MenuActivity.this, ListingActivity.class);

        startActivity(listingPage);
    }

    public void favorite(View view) {
        Intent favoritePage = new Intent(MenuActivity.this, FavoriteActivity.class);

        startActivity(favoritePage);
    }
}