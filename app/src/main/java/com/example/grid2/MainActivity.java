package com.example.grid2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);

    }
    HomeFragment firstFragment = new HomeFragment();
    ProfileFragment secondFragment = new ProfileFragment();

    @SuppressLint({"NonConstantResourceId", "ShowToast"})
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, firstFragment).commit();
                Log.e("e","Home");
                return true;

            case R.id.profile:
                Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, secondFragment).commit();
                Log.e("e","Profile");
                return true;
        }
        return false;
    }
}
