package com.example.financeiro.VIEW;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.example.financeiro.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                drawerLayout.openDrawer(GravityCompat.START); }});

        NavigationView navigationView = findViewById(R.id.navigationView);
        navigationView.setItemIconTintList(null); //para deixar colorido icones


    }
}
