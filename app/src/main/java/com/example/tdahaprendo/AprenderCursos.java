package com.example.tdahaprendo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tdahaprendo.CursoCiencia.MainActivityCiencia;
import com.example.tdahaprendo.CursoComputo.MainActivityComputo;
import com.example.tdahaprendo.CursoComunicacion.MainActivityComunicacion;
import com.example.tdahaprendo.CursoIngles.MainActivityIngles;
import com.example.tdahaprendo.CursoMate.MainActivityMate;
import com.example.tdahaprendo.CursoPersonal.MainActivityPersonal;
import com.example.tdahaprendo.CursoReligion.MainActivityReligion;

public class AprenderCursos extends AppCompatActivity {

    ImageView mImV_backBienv_ofAprenderCursos;
    CardView mCard_view_matex, mCard_view_comux, mCard_view_cienciax, mCard_view_computox, mCard_view_personalx, mCard_view_inglesx, mCard_view_religionx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender_cursos);

        mCard_view_religionx = findViewById(R.id.card_view_religionx);
        mCard_view_religionx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityReligion.class);
                startActivity(intent);
            }
        });

        mCard_view_inglesx = findViewById(R.id.card_view_inglesx);
        mCard_view_inglesx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityIngles.class);
                startActivity(intent);
            }
        });


        mCard_view_personalx = findViewById(R.id.card_view_personalx);
        mCard_view_personalx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityPersonal.class);
                startActivity(intent);
            }
        });


        mCard_view_computox = findViewById(R.id.card_view_computox);
        mCard_view_computox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityComputo.class);
                startActivity(intent);
            }
        });

        mCard_view_cienciax = findViewById(R.id.card_view_cienciax);
        mCard_view_cienciax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityCiencia.class);
                startActivity(intent);
            }
        });

        mCard_view_matex = findViewById(R.id.card_view_matex);
        mCard_view_matex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityMate.class);
                startActivity(intent);
            }
        });

        mCard_view_comux = findViewById(R.id.card_view_comux);
        mCard_view_comux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, MainActivityComunicacion.class);
                startActivity(intent);
            }
        });

        mImV_backBienv_ofAprenderCursos = findViewById(R.id.ImV_backBienv_ofAprenderCursos);
        mImV_backBienv_ofAprenderCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AprenderCursos.this, Bienvenida.class);
                startActivity(intent);
                finish();
            }
        });
    }
}