package org.o7planning.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navgation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override

        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null ;

            if(item.getItemId() == R.id.nav_home){
                selectedFragment = new HomeFrament();
            }
            if(item.getItemId() == R.id.nav_favorite){
                selectedFragment = new FavoritesFrament();
            }
            if(item.getItemId() == R.id.nav_search){
                selectedFragment = new SearchFrament();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
            return true;
        }
    };
}