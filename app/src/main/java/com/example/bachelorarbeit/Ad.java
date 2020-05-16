package com.example.bachelorarbeit;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Ad extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);

        TextView photos = ((TextView)findViewById(R.id.photos));
        photos.setPaintFlags(photos.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        TextView videos = ((TextView)findViewById(R.id.videos));
        videos.setPaintFlags(photos.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        TextView audios = ((TextView)findViewById(R.id.audios));
        audios.setPaintFlags(photos.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        TextView documents = ((TextView)findViewById(R.id.documents));
        documents.setPaintFlags(photos.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
    }

    public void goProfil(View view) {
        Intent intent = new Intent(this, Profil.class);
        startActivity(intent);
    }
}
