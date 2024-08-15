package com.example.tdahaprendo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PanelPrincipal extends AppCompatActivity {


    private CardView mCardMathe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel_principal);

        mCardMathe = (CardView) findViewById(R.id.card_matematica);
        mCardMathe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // startActivity(new Intent(PanelPrincipal.this, IntoMate.class));

            }
        });








    }
}