package com.example.coronatugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button jaga = findViewById(R.id.buttonheart);
        Button tangan = findViewById(R.id.buttonhand);
        Button masker = findViewById(R.id.buttonmask);
        Button fruit = findViewById(R.id.buttonfruit);

        jaga.setOnClickListener(this);
        tangan.setOnClickListener(this);
        masker.setOnClickListener(this);
        fruit.setOnClickListener(this);
    }

    @Override
    public void onClick (View v){
        switch (v.getId()){
            case R.id.buttonheart:
                Intent jagaIntent = new Intent(HomeActivity.this, jaga.class);
                startActivity(jagaIntent);
                break;
            case R.id.buttonhand:
                Intent tanganIntent = new Intent(HomeActivity.this, tangan.class);
                startActivity(tanganIntent);
                break;
            case R.id.buttonmask:
                Intent maskerIntent = new Intent(HomeActivity.this, masker.class);
                startActivity(maskerIntent);
                break;
            case R.id.buttonfruit:
                Intent fruitIntent = new Intent(HomeActivity.this,fruit.class);
                startActivity(fruitIntent);
                break;
        }
    }
}