package com.example.bachelorarbeit;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        //TODO: unerschiedliche Ansicht nach anmeldestatus

        TextView name = ((TextView)findViewById(R.id.user_name));
        ImageView pic = ((ImageView)findViewById(R.id.profil));
        //TODO: name+pic aus datenbank ziehen
    }

    public void goProfil(View view) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }

    public void goSignIn(View view) {
        Toast toast = Toast.makeText(this, "Erfolgreich abgemeldet", Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

    public void signOut(final View view){
        AlertDialog.Builder signOutQuestion = new AlertDialog.Builder( this);
        signOutQuestion.setTitle("Sie sind im Begriff sich abzumelden");
        signOutQuestion.setMessage("Sind Sie sich sicher, dass sie sich abmelden wollen?");

        signOutQuestion.setNegativeButton("Nein", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        signOutQuestion.setPositiveButton("Ja", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                goSignIn(view);
            }
        });

        AlertDialog dialog1 = signOutQuestion.create();
        dialog1.show();
    }

    public void gotoAd(View view){
        Intent intent = new Intent(this, Ad.class);
        startActivity(intent);
    }
}

