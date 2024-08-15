package com.example.tdahaprendo.RelajateTDAH;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tdahaprendo.R;
import com.example.tdahaprendo.ActividadesDash;

public class Sopadeletras extends AppCompatActivity {

    ImageView mImVvolverRela_SDL;
    Button mdescargar_sopadeletras;
    String _urlSopadeLetras = "https://drive.google.com/file/d/1LAmEPF212iHzTElsX1JVex93f4kaHCaG/view?usp=sharing";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sopadeletras);

        mImVvolverRela_SDL = (ImageView) findViewById(R.id.ImVvolverRela_SDL);
        mImVvolverRela_SDL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sopadeletras.this, ActividadesDash.class);
                startActivity(intent);
            }
        });

        mdescargar_sopadeletras = findViewById(R.id.descargar_sopadeletras);
        mdescargar_sopadeletras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _linkSopaLetras = Uri.parse(_urlSopadeLetras);
                Intent intent = new Intent(Intent.ACTION_VIEW,_linkSopaLetras);
                startActivity(intent);
            }
        });

    }
}