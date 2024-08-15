package com.example.tdahaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.tdahaprendo.PreguntasTDAH.PruebasPreguntas;

public class DashboardMain extends AppCompatActivity {

    private String EscogeUnTema =""; // Seleccionar el nombre del tema // selectTopicName == EscogeUnTema

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_main);

        // Estas variables son los cursos
        final LinearLayout Matemática = findViewById(R.id.matelayout);
        final LinearLayout Comunicación = findViewById(R.id.comunicalayout);
        final LinearLayout Ciencia = findViewById(R.id.ciencialayout);
        final LinearLayout Computación = findViewById(R.id.computolayout);
        final LinearLayout Personal = findViewById(R.id.personallayout);
        final LinearLayout Inglés = findViewById(R.id.ingleslayout);
        final LinearLayout Religión = findViewById(R.id.religionlayout);
        final LinearLayout Prueba = findViewById(R.id.pruebalayout);
        final ImageView RegresarDash = findViewById(R.id.ImVwregresardash);

        final Button btnempezarprueba = findViewById(R.id.btnEmpezarPrueba);

        Matemática.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EscogeUnTema="Matemática";
                Matemática.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Comunicación.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Comunicación";
                Comunicación.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Ciencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Ciencia";
                Ciencia.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Computación.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Computación";

                Computación.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Personal";

                Personal.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);

            }
        });

        Inglés.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Inglés";

                Inglés.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Religión.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Religión";

                Religión.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Prueba.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        Prueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EscogeUnTema="Prueba";

                Prueba.setBackgroundResource(R.drawable.round_black_white_stroke10);

                Matemática.setBackgroundResource(R.drawable.round_black_white10);
                Comunicación.setBackgroundResource(R.drawable.round_black_white10);
                Ciencia.setBackgroundResource(R.drawable.round_black_white10);
                Computación.setBackgroundResource(R.drawable.round_black_white10);
                Personal.setBackgroundResource(R.drawable.round_black_white10);
                Inglés.setBackgroundResource(R.drawable.round_black_white10);
                Religión.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        // Iniciamos los eventos con el boton
        btnempezarprueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EscogeUnTema.isEmpty()){
                    Toast.makeText(DashboardMain.this, "Por favor selecciona un tema.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(DashboardMain.this, PruebasPreguntas.class);
                    intent.putExtra("selectedTopic", EscogeUnTema);
                    startActivity(intent);
                }
            }
        });

        RegresarDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardMain.this, Bienvenida.class));
                finish();
            }
        });

    }
}