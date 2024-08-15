package com.example.tdahaprendo.CursoReligion;

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

public class MainActivityReligion extends AppCompatActivity {
    RecyclerView recyclerView;
    MainAdapterReligion mainAdapterReligion;
    ImageView mImVwBack_AprendCurso_religion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_religion);

        recyclerView = findViewById(R.id.recyvw_religion);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelReligion> options =
                new FirebaseRecyclerOptions.Builder<MainModelReligion>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales").child("ReligionCourse"), MainModelReligion.class)
                        .build();

        mainAdapterReligion = new MainAdapterReligion(options);
        recyclerView.setAdapter(mainAdapterReligion);

        mImVwBack_AprendCurso_religion = findViewById(R.id.ImVwBack_AprendCurso_religion);
        mImVwBack_AprendCurso_religion.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityReligion.this, AprenderCursos.class);
            startActivity(i);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterReligion.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterReligion.stopListening();
    }
}