package com.example.domokosdavid_firebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertActivity extends AppCompatActivity {

    private EditText editNev, editOrszag, editLakossag;
    private Button buttonUjFelvetel, buttonUjVissza;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        init();

        buttonUjFelvetel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nev, orszag, lakossag;
                nev = editNev.getText().toString();
                orszag = editOrszag.getText().toString();
                lakossag = editLakossag.getText().toString();
                if (nev.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editNev.setError("Nem lehet üres!");
                }else if (orszag.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editOrszag.setError("Nem lehet üres!");
                } else if(lakossag.isEmpty()){
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikertelen!", Toast.LENGTH_SHORT).show();
                    editLakossag.setError("Nem lehet üres!");
                }else{
                    firebaseDatabase = FirebaseDatabase.getInstance();
                    databaseReference = firebaseDatabase.getReference("városok");
                    Varosok varosok = new Varosok(nev, orszag, lakossag);
                    databaseReference.child(nev).setValue(varosok);
                    Toast.makeText(InsertActivity.this, "Hozzáadás sikeres!", Toast.LENGTH_SHORT).show();
                }

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