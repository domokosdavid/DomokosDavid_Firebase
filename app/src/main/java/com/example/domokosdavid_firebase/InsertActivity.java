package com.example.domokosdavid_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
    public void init(){
        editNev = findViewById(R.id.editNev);
        editOrszag = findViewById(R.id.editOrszag);
        editLakossag = findViewById(R.id.editLakossag);
        buttonUjFelvetel = findViewById(R.id.buttonUjFelvetel);
        buttonUjVissza = findViewById(R.id.buttonUjVissza);
    }
}