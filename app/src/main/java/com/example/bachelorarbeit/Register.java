package com.example.bachelorarbeit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

    }

    public void register(View view){
        Toast toast = Toast.makeText(this, "Willkommen", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        //TODO: Datenbank erweitern + passwort abfragen
    }
}
