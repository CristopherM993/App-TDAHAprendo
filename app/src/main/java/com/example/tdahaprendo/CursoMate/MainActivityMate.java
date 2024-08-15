package com.example.tdahaprendo.CursoMate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import com.example.tdahaprendo.AprenderCursos;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivityMate extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapterMate mainAdapterMate;

    ImageView mImVwBack_AprendCurso_mate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mate);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelMate> options =
                new FirebaseRecyclerOptions.Builder<MainModelMate>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales")
                                .child("MateCourse"), MainModelMate.class)
                        .build();

        mainAdapterMate = new MainAdapterMate(options);
        recyclerView.setAdapter(mainAdapterMate);

        mImVwBack_AprendCurso_mate = findViewById(R.id.ImVwBack_AprendCurso_mate);
        mImVwBack_AprendCurso_mate.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityMate.this, AprenderCursos.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterMate.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterMate.stopListening();
    }
}