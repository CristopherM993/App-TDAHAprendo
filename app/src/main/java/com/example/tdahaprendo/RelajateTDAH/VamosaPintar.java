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

public class VamosaPintar extends AppCompatActivity {
    ImageView mImVvolverRela_VAP;
    Button mdescargar_VamosaColorear;
    String _urlColorear = "https://drive.google.com/file/d/1AG4od7e6YBZDJw7nqrcRm4eDeJSLijgV/view?usp=sharing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vamosa_pintar);

        mImVvolverRela_VAP = (ImageView) findViewById(R.id.ImVvolverRela_VAP);
        mImVvolverRela_VAP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VamosaPintar.this, ActividadesDash.class);
                startActivity(intent);
            }
        });

        mdescargar_VamosaColorear = findViewById(R.id.descargar_VamosaColorear);
        mdescargar_VamosaColorear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _linkColorear = Uri.parse(_urlColorear);
                Intent intent = new Intent(Intent.ACTION_VIEW,_linkColorear);
                startActivity(intent);
            }
        });

    }
}