package com.android.wishlist.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.android.wishlist.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity  implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    PresentsFragment presentsFragment = new PresentsFragment();
    FriendsFragment friendsFragment = new FriendsFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    AddPresentFragment addPresentFragment = new AddPresentFragment();

    private void setHomeToolbar() {
        toolbar.setTitle(R.string.my_presents);
    }

    private void setSettingsToolbar(int title) {
        toolbar.setTitle(title);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, presentsFragment).commit();
                setHomeToolbar();
            }
        });

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.presents);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.friends:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, friendsFragment).commit();
                setSettingsToolbar(R.string.my_friends);
                return true;

            case R.id.presents:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, presentsFragment).commit();
                setHomeToolbar();
                return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                setSettingsToolbar(R.string.settings);
                return true;
        }
        return false;
    }
}