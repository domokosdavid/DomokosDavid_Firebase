package com.example.domokosdavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonListazas, buttonFelvetel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        buttonListazas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listazasra = new Intent(MainActivity.this, ListResultActivity.class);
                startActivity(listazasra);
                finish();
            }
        });

        buttonFelvetel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insertre = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(insertre);
                finish();
            }
        });
    }

    public void init(){
        buttonListazas = findViewById(R.id.buttonListazas);
        buttonFelvetel = findViewById(R.id.buttonFelvetel);
    }
}