package com.example.tdahaprendo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoPanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_panel);

        TextView textView = findViewById(R.id.TextViewLink);
        Button entendido = findViewById(R.id.EntendidoInfo);

        textView.setMovementMethod(LinkMovementMethod.getInstance());

        entendido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(InfoPanel.this, Bienvenida.class));
                finish();
            }
        });

    }
}