package com.example.tdahaprendo.PreguntasTDAH;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tdahaprendo.Bienvenida;
import com.example.tdahaprendo.DashboardMain;
import com.example.tdahaprendo.R;

public class ResultadosPrueba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_prueba);

        final AppCompatButton startnewButton = findViewById(R.id.startNewQuizz);
        final TextView correctanswer = findViewById(R.id.TextvieWcorrectanswer);
        final TextView incorrectanswer = findViewById(R.id.TextvieWincorrectanswer);
        final ImageView cerrar = findViewById(R.id.ImgVcerrar);

        final int getCorrectAnswer = getIntent().getIntExtra("correct",0);
        final int getInCorrectAnswer = getIntent().getIntExtra("incorrect",0);

        correctanswer.setText(String.valueOf(getCorrectAnswer));
        incorrectanswer.setText(String.valueOf(getInCorrectAnswer));

        startnewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadosPrueba.this, DashboardMain.class));
                finish();
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultadosPrueba.this, Bienvenida.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //// Revisar la logica del código
        startActivity(new Intent(ResultadosPrueba.this, DashboardMain.class));
        finish();
    }
}