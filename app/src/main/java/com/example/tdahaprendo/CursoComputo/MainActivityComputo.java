package com.example.tdahaprendo.CursoComputo;

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

public class MainActivityComputo extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapterComputo mainAdapterComputo;
    ImageView mImVwBack_AprendCurso_computo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_computo);

        recyclerView = findViewById(R.id.recyvw_computo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelComputo> options =
                new FirebaseRecyclerOptions.Builder<MainModelComputo>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales")
                                .child("ComputoCourse"), MainModelComputo.class)
                        .build();

        mainAdapterComputo = new MainAdapterComputo(options);
        recyclerView.setAdapter(mainAdapterComputo);

        mImVwBack_AprendCurso_computo = findViewById(R.id.ImVwBack_AprendCurso_Computo);
        mImVwBack_AprendCurso_computo.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityComputo.this, AprenderCursos.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterComputo.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterComputo.stopListening();
    }
}