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

public class Rompecabezas extends AppCompatActivity {
    ImageView mImVvolverRela_RPCBZ;
    Button mdescargar_rompecabezas;
    String _urlRompecabezas = "https://drive.google.com/file/d/1fdyIOZCL59dgtK-3RhUMDv-KFtabxuXY/view?usp=sharing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rompecabezas);

        mImVvolverRela_RPCBZ = (ImageView) findViewById(R.id.ImVvolverRela_RPCBZ);
        mImVvolverRela_RPCBZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Rompecabezas.this, ActividadesDash.class);
                startActivity(intent);
            }
        });

        mdescargar_rompecabezas = (Button) findViewById(R.id.descargar_rompecabezas);
        mdescargar_rompecabezas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri _linkRompecabezas = Uri.parse(_urlRompecabezas);
                Intent intent = new Intent(Intent.ACTION_VIEW,_linkRompecabezas);
                startActivity(intent);
            }
        });
    }
}