package com.example.domokosdavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InsertActivity extends AppCompatActivity {

    private EditText editNev, editOrszag, editLakossag;
    private Button buttonUjFelvetel, buttonUjVissza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        init();

        buttonUjFelvetel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        buttonUjVissza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainre = new Intent(InsertActivity.this, MainActivity.class);
                startActivity(mainre);
                finish();
            }
        });
    }
    public void init(){
        editNev = findViewById(R.id.editNev);
        editOrszag = findViewById(R.id.editOrszag);
        editLakossag = findViewById(R.id.editLakossag);
        buttonUjFelvetel = findViewById(R.id.buttonUjFelvetel);
        buttonUjVissza = findViewById(R.id.buttonUjVissza);
    }
}