package com.example.tdahaprendo.CursoIngles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.tdahaprendo.AprenderCursos;
import com.example.tdahaprendo.CursoMate.MainActivityMate;
import com.example.tdahaprendo.CursoMate.MainAdapterMate;
import com.example.tdahaprendo.CursoMate.MainModelMate;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivityIngles extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapterIngles mainAdapterIngles;
    ImageView mImVwBack_AprendCurso_ingles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ingles);

        recyclerView = findViewById(R.id.recyvw_ingles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelIngles> options =
                new FirebaseRecyclerOptions.Builder<MainModelIngles>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales").child("InglesCourse"), MainModelIngles.class)
                        .build();

        mainAdapterIngles = new MainAdapterIngles(options);
        recyclerView.setAdapter(mainAdapterIngles);

        mImVwBack_AprendCurso_ingles = findViewById(R.id.ImVwBack_AprendCurso_Ingles);
        mImVwBack_AprendCurso_ingles.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityIngles.this, AprenderCursos.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterIngles.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterIngles.stopListening();
    }
}