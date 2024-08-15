package com.example.tdahaprendo.PreguntasTDAH;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tdahaprendo.DashboardMain;
import com.example.tdahaprendo.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class PruebasPreguntas extends AppCompatActivity {

    private TextView cantdepreguntas, preguntageneral; // questions // question
    private AppCompatButton alternativa1, alternativa2, alternativa3, alternativa4, btnsiguientepregunta; // nextbtn
    private Timer quizzTimer;
    private int TotalTimeInMins = 4; //1 COORRREGIRRR
    private int seconds = 0; //0 CORREGIRRR
    private final List<ListaPreguntas> ListaDePreguntas = new ArrayList<>(); //questionLists;
    private int PosicionActualPregunta =0; // currentQuestionPosition=0;
    private String SeleccionaOpcionUsuario=""; // selectOptionbyUser=
    private int tiempoTotalMillissss = 150000;
    private int intervaloMillissss = 1000;

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pruebas_preguntas);

        final ImageView volverdash = findViewById(R.id.VolverDash); // flechaizquierdaaa
        final TextView tiempo = findViewById(R.id.Tiempo);  // 00:59 timer
        final TextView seleccionanombredeltema = findViewById(R.id.NombreDelCurso); // selectTopicName

        cantdepreguntas = findViewById(R.id.CantidadDePreguntas); // Cantidad de preguntas
        preguntageneral = findViewById(R.id.PreguntaGeneral); // Preguntas por colocar

        alternativa1 = findViewById(R.id.alternativa_1);
        alternativa2 = findViewById(R.id.alternativa_2);
        alternativa3 = findViewById(R.id.alternativa_3);
        alternativa4 = findViewById(R.id.alternativa_4);

        btnsiguientepregunta = findViewById(R.id.btnSiguientePreg);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic"); // selectedTopic

        // Coloca en el curso escogido el nombre que selecciono
        seleccionanombredeltema.setText(getSelectedTopicName);

        ProgressDialog progressDialog = new ProgressDialog(PruebasPreguntas.this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Cargando");
        progressDialog.show();

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://tdahaprendofinal-default-rtdb.firebaseio.com/");
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

               tiempoTotalMillissss = Integer.parseInt(snapshot.child("Tiempo").getValue(String.class));

                assert getSelectedTopicName != null;
                for(DataSnapshot dataSnapshot: snapshot.child(getSelectedTopicName).getChildren()){
                    final String getQuestion = dataSnapshot.child("question").getValue(String.class);
                    final String getOption1 = dataSnapshot.child("option1").getValue(String.class);
                    final String getOption2 = dataSnapshot.child("option2").getValue(String.class);
                    final String getOption3 = dataSnapshot.child("option3").getValue(String.class);
                    final String getOption4 = dataSnapshot.child("option4").getValue(String.class);
                    final String getAnswer = dataSnapshot.child("answer").getValue(String.class);
                    final String getUserSelectedAnswer = dataSnapshot.child("userSelectedAnswer").getValue(String.class);

                    ListaPreguntas listaPreguntas = new ListaPreguntas(getQuestion,getOption1,getOption2,getOption3,getOption4,getAnswer,getUserSelectedAnswer );
                    ListaDePreguntas.add(listaPreguntas);
                }

                progressDialog.hide();
                cantdepreguntas.setText((PosicionActualPregunta+1)+"/"+ListaDePreguntas.size());
                preguntageneral.setText(ListaDePreguntas.get(PosicionActualPregunta).getQuestion());
                alternativa1.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption1());
                alternativa2.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption2());
                alternativa3.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption3());
                alternativa4.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption4());

                StartTime(tiempo);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }


        });

        // ListaDePreguntas = BancoPreguntas.getQuestions(getSelectedTopicName);

//        cantdepreguntas.setText((PosicionActualPregunta+1)+"/"+ListaDePreguntas.size());
//        preguntageneral.setText(ListaDePreguntas.get(0).getQuestion());
//        alternativa1.setText(ListaDePreguntas.get(0).getOption1());
//        alternativa2.setText(ListaDePreguntas.get(0).getOption2());
//        alternativa3.setText(ListaDePreguntas.get(0).getOption3());
//        alternativa4.setText(ListaDePreguntas.get(0).getOption4());

        alternativa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SeleccionaOpcionUsuario.isEmpty()){
                    SeleccionaOpcionUsuario= alternativa1.getText().toString();
                    alternativa1.setBackgroundResource(R.drawable.round_back_red10);
                    alternativa1.setTextColor(Color.WHITE);
                    RevelarRespuesta();
                    ListaDePreguntas.get(PosicionActualPregunta).setUserSelectedAnswer(SeleccionaOpcionUsuario);
                }
            }
        });

        alternativa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SeleccionaOpcionUsuario.isEmpty()){
                    SeleccionaOpcionUsuario= alternativa2.getText().toString();
                    alternativa2.setBackgroundResource(R.drawable.round_back_red10);
                    alternativa2.setTextColor(Color.WHITE);
                    RevelarRespuesta();
                    ListaDePreguntas.get(PosicionActualPregunta).setUserSelectedAnswer(SeleccionaOpcionUsuario);
                }
            }
        });

        alternativa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SeleccionaOpcionUsuario.isEmpty()){
                    SeleccionaOpcionUsuario= alternativa3.getText().toString();
                    alternativa3.setBackgroundResource(R.drawable.round_back_red10);
                    alternativa3.setTextColor(Color.WHITE);
                    RevelarRespuesta();
                    ListaDePreguntas.get(PosicionActualPregunta).setUserSelectedAnswer(SeleccionaOpcionUsuario);
                }
            }
        });

        alternativa4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SeleccionaOpcionUsuario.isEmpty()){
                    SeleccionaOpcionUsuario= alternativa4.getText().toString();
                    alternativa4.setBackgroundResource(R.drawable.round_back_red10);
                    alternativa4.setTextColor(Color.WHITE);
                    RevelarRespuesta();
                    ListaDePreguntas.get(PosicionActualPregunta).setUserSelectedAnswer(SeleccionaOpcionUsuario);
                }
            }
        });


        btnsiguientepregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(SeleccionaOpcionUsuario.isEmpty()){
                    Toast.makeText(PruebasPreguntas.this, "Por favor seleciona una opción",Toast.LENGTH_SHORT).show();
                } else {
                    CambienSiguientePregunta();
                }
            }
        });

        // Esta accion nos permite regresar al Dashboard principal
        volverdash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // countDownTimer.purge();
                countDownTimer.cancel();
                startActivity(new Intent(PruebasPreguntas.this, DashboardMain.class));
                finish();
            }
        });
    }

    private void StartTime(TextView timerTextView){

        // Crear el temporizador con el tiempo total y el intervalo
        countDownTimer = new CountDownTimer(tiempoTotalMillissss, intervaloMillissss) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Se llama cada vez que el temporizador avanza (cada segundo en este ejemplo)
                long segundosRestantes = millisUntilFinished / 1000;
                timerTextView.setText(segundosRestantes + " segundos");
            }

            @Override
            public void onFinish() {
//                // Se llama cuando el temporizador llega a cero
//                Intent intent = new Intent(PruebasPreguntas.this, ResultadosPrueba.class);
//                intent.putExtra("correct", ObtenerRespuestasCorrectas());
//                intent.putExtra("incorrect", ObtenerRespuestasIncorrectas());
//                startActivity(intent);
                Dialog dialog = new Dialog(PruebasPreguntas.this);
                dialog.getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
                dialog.setContentView(R.layout.tiempo_terminado);

                dialog.findViewById(R.id.btn_empezarnuevox).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(PruebasPreguntas.this, DashboardMain.class ));
                        finish();
                    }
                });
                dialog.setCancelable(false);
                dialog.show();
            }

        };
        // Iniciar el temporizador
        countDownTimer.start();
    }

    private void CambienSiguientePregunta(){

        PosicionActualPregunta++;
        if((PosicionActualPregunta+1) == ListaDePreguntas.size()){
            btnsiguientepregunta.setText("Finalizar");
        }
        if (PosicionActualPregunta < ListaDePreguntas.size()){
            SeleccionaOpcionUsuario="";

            alternativa1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternativa1.setTextColor(Color.parseColor("#1F6BB8"));

            alternativa2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternativa2.setTextColor(Color.parseColor("#1F6BB8"));

            alternativa3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternativa3.setTextColor(Color.parseColor("#1F6BB8"));

            alternativa4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            alternativa4.setTextColor(Color.parseColor("#1F6BB8"));

            cantdepreguntas.setText((PosicionActualPregunta+1)+"/"+ListaDePreguntas.size());
            preguntageneral.setText(ListaDePreguntas.get(PosicionActualPregunta).getQuestion());
            alternativa1.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption1());
            alternativa2.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption2());
            alternativa3.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption3());
            alternativa4.setText(ListaDePreguntas.get(PosicionActualPregunta).getOption4());
        }
        else {
            Intent intent = new Intent(PruebasPreguntas.this, ResultadosPrueba.class);
            intent.putExtra("correct",ObtenerRespuestasCorrectas());
            intent.putExtra("incorrect",ObtenerRespuestasIncorrectas());
            startActivity(intent);
            finish();
        }
    }

    // funcion empieza el tiempo //
    private void EmpezarTiempo (TextView timerTextView){
        quizzTimer = new Timer(); // inicializar.
        quizzTimer.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if(seconds == 0){
                    TotalTimeInMins --;
                    seconds = 59;
                }
                // corregir
                else if (seconds == 0 && TotalTimeInMins ==0) {

                    quizzTimer.purge();
                    quizzTimer.cancel();
                    Toast.makeText(PruebasPreguntas.this, "Se acabo el tiempo", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(PruebasPreguntas.this, ResultadosPrueba.class);
                    intent.putExtra("correct", ObtenerRespuestasCorrectas());
                    intent.putExtra("incorrect", ObtenerRespuestasIncorrectas());
                    startActivity(intent);
                    finish();

                }
                else {
                    seconds--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(TotalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);
                        if(finalMinutes.length() == 1){
                            finalMinutes = "0" +finalMinutes;
                        }

                        if(finalSeconds.length() == 1){
                            finalSeconds = "0" + finalSeconds;
                        }
                        timerTextView.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        },1000,1000);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    // funcion obtener claves correctas //
    private int ObtenerRespuestasCorrectas(){
        int RespuestasCorrectas = 0;

        for(int i=0;i<ListaDePreguntas.size();i++){

            final String getUserSelectedAnswer = ListaDePreguntas.get(i).getUserSelectedAnswer();
            final String getAnswer = ListaDePreguntas.get(i).getAnswer();

            if(getUserSelectedAnswer.equals(getAnswer)){
                RespuestasCorrectas++;
            }
        }
        return RespuestasCorrectas;
    }

    // funcion obtener claves incorrectas //
    private int ObtenerRespuestasIncorrectas(){

        int IncorrectAnswers = 0;
        for(int i=0;i<ListaDePreguntas.size();i++){
            final String getUserSelectedAnswer = ListaDePreguntas.get(i).getUserSelectedAnswer();
            final String getAnswer = ListaDePreguntas.get(i).getAnswer();
            if(!getUserSelectedAnswer.equals(getAnswer)){
                IncorrectAnswers++;
            }
        }
        return IncorrectAnswers;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // quizzTimer.purge();
        countDownTimer.cancel();
        startActivity(new Intent(PruebasPreguntas.this, DashboardMain.class));
        finish();
    }

    private void RevelarRespuesta(){
        final String getAnswer = ListaDePreguntas.get(PosicionActualPregunta).getAnswer();

        if(alternativa1.getText().toString().equals(getAnswer)){
            alternativa1.setBackgroundResource(R.drawable.round_back_green10);
            alternativa1.setTextColor(Color.WHITE);
        }
        else if (alternativa2.getText().toString().equals(getAnswer)) {
            alternativa2.setBackgroundResource(R.drawable.round_back_green10);
            alternativa2.setTextColor(Color.WHITE);
        }
        else if (alternativa3.getText().toString().equals(getAnswer)) {
            alternativa3.setBackgroundResource(R.drawable.round_back_green10);
            alternativa3.setTextColor(Color.WHITE);
        }
        else if (alternativa4.getText().toString().equals(getAnswer)) {
            alternativa4.setBackgroundResource(R.drawable.round_back_green10);
            alternativa4.setTextColor(Color.WHITE);
        }
    }
}


