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

public class Laberintos extends AppCompatActivity {
    ImageView mImVvolverRela_LBTS;
    Button mdescargar_laberintos;
    String _urlLaberintos = "https://drive.google.com/file/d/19D2nzNTyaDwJzMt5oKZQTenP92x9T3df/view?usp=sharing";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laberintos);

        mImVvolverRela_LBTS = (ImageView) findViewById(R.id.ImVvolverRela_LBTS);
        mImVvolverRela_LBTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Laberintos.this, ActividadesDash.class);
                startActivity(intent);
            }
        });

        mdescargar_laberintos = findViewById(R.id.descargar_laberintos);
        mdescargar_laberintos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _linkLaberintos = Uri.parse(_urlLaberintos);
                Intent intent = new Intent(Intent.ACTION_VIEW,_linkLaberintos);
                startActivity(intent);
            }
        });

    }
}