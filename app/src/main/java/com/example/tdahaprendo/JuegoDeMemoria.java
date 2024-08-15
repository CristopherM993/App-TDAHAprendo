package com.example.tdahaprendo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class JuegoDeMemoria extends AppCompatActivity {
    TextView tv_Jugador1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;
    ImageView mImVvolverJuegoMemoria;

    // Array para las imagenes
    Integer[] cardsArray = {101,102,103,104,105,106,201,202,203,204,205,206};

    //Imagenes actuales
    int image101,image102,image103,image104,image105,image106, image201,image202,image203,image204,image205,image206;
    int PrimeraTarjeta, SegundaTarjeta;
    int ClicPrimero, ClicSegundo;
    int NumeroDeTarjeta = 1;

    int Turno = 1;
    int PuntosJugadorUno = 0, PuntosJugadorDos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_de_memoria);

        tv_Jugador1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0"); iv_12.setTag("1"); iv_13.setTag("2"); iv_14.setTag("3");
        iv_21.setTag("4"); iv_22.setTag("5"); iv_23.setTag("6"); iv_24.setTag("7");
        iv_31.setTag("8"); iv_32.setTag("9"); iv_33.setTag("10"); iv_34.setTag("11");

        mImVvolverJuegoMemoria = (ImageView) findViewById(R.id.ImVvolverJuegoMemoria);
        mImVvolverJuegoMemoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JuegoDeMemoria.this, Bienvenida.class));
            }
        });

        RecursoDeCartasDefrente();

        // Barajea las imagenes
        Collections.shuffle(Arrays.asList(cardsArray));

        // Cambia el color del segundo jugador inactivo
        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, theCard);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, theCard);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, theCard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, theCard);
            }
        });

        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, theCard);
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, theCard);
            }
        });

        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, theCard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, theCard);
            }
        });

        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, theCard);
            }
        });

        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_32, theCard);
            }
        });

        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, theCard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, theCard);
            }
        });
    }

    private void doStuff(ImageView iv, int card){
        // Establecer la imagen correcta en el ImagenView
        if(cardsArray[card]==101){
            iv.setImageResource(image101);
        } else if (cardsArray[card]==102) {
            iv.setImageResource(image102);
        }else if (cardsArray[card]==103) {
            iv.setImageResource(image103);
        }else if (cardsArray[card]==104) {
            iv.setImageResource(image104);
        }else if (cardsArray[card]==105) {
            iv.setImageResource(image105);
        }else if (cardsArray[card]==106) {
            iv.setImageResource(image106);
        }else if (cardsArray[card]==201) {
            iv.setImageResource(image201);
        }else if (cardsArray[card]==202) {
            iv.setImageResource(image202);
        }else if (cardsArray[card]==203) {
            iv.setImageResource(image203);
        }else if (cardsArray[card]==204) {
            iv.setImageResource(image204);
        }else if (cardsArray[card]==205) {
            iv.setImageResource(image205);
        }else if (cardsArray[card]==206) {
            iv.setImageResource(image206);
        }

        // Checa que imagen es seleccionada y lo guarda en una variable temporal.
        if(NumeroDeTarjeta==1){
            PrimeraTarjeta = cardsArray[card];
            if(PrimeraTarjeta>200){
                PrimeraTarjeta = PrimeraTarjeta - 100;
            }
            NumeroDeTarjeta = 2;
            ClicPrimero = card;
            iv.setEnabled(false);
        } else if (NumeroDeTarjeta ==2) {
            SegundaTarjeta = cardsArray[card];
            if(SegundaTarjeta > 200){
                SegundaTarjeta = SegundaTarjeta - 100;
            }

            NumeroDeTarjeta = 1;
            ClicSegundo = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Checa si las imagenes selecionadas son iguales
                    CompararImagenes();
                }
            }, 1000);
        }
    }

    private void CompararImagenes() {
        if (PrimeraTarjeta == SegundaTarjeta) {
            if (ClicPrimero == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (ClicPrimero == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (ClicSegundo == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (ClicSegundo == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (Turno == 1) {
                PuntosJugadorUno++;
                tv_Jugador1.setText("Jugador 1:" + PuntosJugadorUno);
            } else if (Turno == 2) {
                PuntosJugadorDos++;
                tv_p2.setText("Jugador 2:" + PuntosJugadorDos);

            }
        } else {
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
            iv_23.setImageResource(R.drawable.ic_back);
            iv_24.setImageResource(R.drawable.ic_back);
            iv_31.setImageResource(R.drawable.ic_back);
            iv_32.setImageResource(R.drawable.ic_back);
            iv_33.setImageResource(R.drawable.ic_back);
            iv_34.setImageResource(R.drawable.ic_back);

            if (Turno == 1) {
                Turno = 2;
                tv_Jugador1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if (Turno == 2) {
                Turno = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_Jugador1.setTextColor(Color.BLACK);
            }
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        // Chequea si el juego termino
        ComprobarFin();
    }

    private void ComprobarFin(){
        if(iv_11.getVisibility() == View.INVISIBLE &&
                iv_12.getVisibility() == View.INVISIBLE &&
                iv_13.getVisibility() == View.INVISIBLE &&
                iv_14.getVisibility() == View.INVISIBLE &&
                iv_21.getVisibility() == View.INVISIBLE &&
                iv_22.getVisibility() == View.INVISIBLE &&
                iv_23.getVisibility() == View.INVISIBLE &&
                iv_24.getVisibility() == View.INVISIBLE &&
                iv_31.getVisibility() == View.INVISIBLE &&
                iv_32.getVisibility() == View.INVISIBLE &&
                iv_33.getVisibility() == View.INVISIBLE &&
                iv_34.getVisibility() == View.INVISIBLE) {

                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(JuegoDeMemoria.this);
                    alertDialogBuilder
                        .setMessage("Puntos Jugador 1: "+PuntosJugadorUno+" \n\n Puntos Jugador 2:" +PuntosJugadorDos)
                        .setCancelable(false)
                        .setPositiveButton("REINICIAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                Intent intent = new Intent(getApplicationContext(), JuegoDeMemoria.class);
                                startActivity(intent);
                                finish();
                            }
                        })
                        .setNegativeButton("SALIR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        });

                        AlertDialog alertDialog = alertDialogBuilder.create();
                        alertDialog.setTitle("¡Se termino el juego!");
                        alertDialog.show();
        }
    }



    private void RecursoDeCartasDefrente() {

        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image203;
        image204 = R.drawable.ic_image204;
        image205 = R.drawable.ic_image205;
        image206 = R.drawable.ic_image206;

    }


}