package com.example.domokosdavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonListazas, buttonFelvetel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){
        buttonListazas = findViewById(R.id.buttonListazas);
        buttonFelvetel = findViewById(R.id.buttonFelvetel);
    }
}