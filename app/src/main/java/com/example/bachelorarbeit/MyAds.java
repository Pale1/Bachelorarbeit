package com.example.bachelorarbeit;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MyAds extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myads);
        //TODO: view nach inseraten gestalten
    }

    public void deleteAd(View view){
        AlertDialog.Builder delete = new AlertDialog.Builder( this);
        delete.setTitle("Sie sind im Begriff ein Element zu löschen");
        delete.setMessage("Sind Sie sich sicher, dass Sie dieses Element unwiederruflich löschen wollen? \nEs kann dann nicht wieder hergestellt werden.");

        delete.setNegativeButton("Nein", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        delete.setPositiveButton("Ja", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //TODO: delete
            }
        });

        AlertDialog dialog1 = delete.create();
        dialog1.show();
    }
}
