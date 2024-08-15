package com.example.tdahaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tdahaprendo.RelajateTDAH.Laberintos;
import com.example.tdahaprendo.RelajateTDAH.Rompecabezas;
import com.example.tdahaprendo.RelajateTDAH.Sopadeletras;
import com.example.tdahaprendo.RelajateTDAH.VamosaPintar;

public class ActividadesDash extends AppCompatActivity {
    ImageView mImVw_back_bienvenida;
    LinearLayout mSopadeLetraslayout, mLaberintoslayout, mRompecabezaslayout, mColorearlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividades_dash);

        mColorearlayout = (LinearLayout) findViewById(R.id.Colorearlayout);
        mColorearlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadesDash.this, VamosaPintar.class);
                startActivity(intent);
            }
        });

        mRompecabezaslayout = (LinearLayout) findViewById(R.id.Rompecabezaslayout);
        mRompecabezaslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadesDash.this, Rompecabezas.class);
                startActivity(intent);
            }
        });


        mLaberintoslayout = (LinearLayout) findViewById(R.id.Laberintoslayout);
        mLaberintoslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadesDash.this, Laberintos.class);
                startActivity(intent);
            }
        });


        mSopadeLetraslayout = (LinearLayout) findViewById(R.id.SopadeLetraslayout);
        mSopadeLetraslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActividadesDash.this, Sopadeletras.class);
                startActivity(intent);
            }
        });


        mImVw_back_bienvenida = (ImageView) findViewById(R.id.ImVw_back_bienvenida);
        mImVw_back_bienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActividadesDash.this, Bienvenida.class));
                finish();
            }
        });

    }
}