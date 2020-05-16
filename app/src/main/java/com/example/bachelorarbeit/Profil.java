package com.example.bachelorarbeit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        TextView name = ((TextView)findViewById(R.id.profil_name));
        TextView email = ((TextView)findViewById(R.id.profil_email));
        TextView number = ((TextView)findViewById(R.id.profil_number));
        TextView comment = ((TextView)findViewById(R.id.profil_comment));
        ImageView pic = ((ImageView)findViewById(R.id.profil_pic));
        //TODO: Infos aus Datenbank ziehen

        ImageButton changeName = ((ImageButton)findViewById(R.id.profil_changeName));
        ImageButton changeComment = ((ImageButton)findViewById(R.id.profil_changeComment));
        ImageButton changeEmail = ((ImageButton)findViewById(R.id.profil_changeEmail));
        ImageButton changeNumber = ((ImageButton)findViewById(R.id.profil_changeNumber));
        ImageButton changePic = ((ImageButton)findViewById(R.id.profil_changePic));
        //TODO: unterschiedliche ansichten für profilbesitzer oder anschauer
    }

    public void gotoMyAds(View view){
        Intent intent = new Intent(this, MyAds.class);
        startActivity(intent);
    }
}
