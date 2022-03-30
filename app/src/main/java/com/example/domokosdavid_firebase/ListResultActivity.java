package com.example.domokosdavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ListResultActivity extends AppCompatActivity {

    private TextView textViewOrszagok;
    private Button buttonVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result);
        init();
    }
    public void init(){
        textViewOrszagok = findViewById(R.id.textViewOrszagok);
        buttonVissza = findViewById(R.id.buttonVissza);
    }
}