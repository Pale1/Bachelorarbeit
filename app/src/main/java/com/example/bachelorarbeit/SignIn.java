package com.example.bachelorarbeit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

    }

    public void signInButton(View view){
        Toast toast = Toast.makeText(this, "Erfolgreich angemeldet", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        String email = ((EditText)findViewById(R.id.emailInput)).getText().toString();
        String password = ((EditText)findViewById(R.id.passwordInput)).getText().toString();
        //TODO: SignIn Abfrage
    }

    public void continueAsGuest(View view){
        Toast toast = Toast.makeText(this, "Gastzugriff", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        //TODO: Einschreankungen
    }

    public void register(View view){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
