package com.example.tdahaprendo.CursoPersonal;

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

public class MainActivityPersonal extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapterPersonal mainAdapterPersonal;

    ImageView mImVwBack_AprendCurso_personal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_personal);

        recyclerView = findViewById(R.id.recyvw_personal);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelPersonal> options =
                new FirebaseRecyclerOptions.Builder<MainModelPersonal>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales").child("PersonalCourse"), MainModelPersonal.class)
                        .build();

        mainAdapterPersonal = new MainAdapterPersonal(options);
        recyclerView.setAdapter(mainAdapterPersonal);

        mImVwBack_AprendCurso_personal = findViewById(R.id.ImVwBack_AprendCurso_Personal);
        mImVwBack_AprendCurso_personal.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityPersonal.this, AprenderCursos.class);
            startActivity(i);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterPersonal.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterPersonal.stopListening();
    }
}