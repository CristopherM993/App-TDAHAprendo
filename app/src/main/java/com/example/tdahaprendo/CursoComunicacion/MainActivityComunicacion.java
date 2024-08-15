package com.example.tdahaprendo.CursoComunicacion;

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

public class MainActivityComunicacion extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapterComunicacion mainAdapterComunicacion;

    ImageView mImVwBack_AprendCurso_comu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_comunicacion);

        recyclerView = findViewById(R.id.recyvw_comu);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelComu> options =
                new FirebaseRecyclerOptions.Builder<MainModelComu>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales").child("ComunicacionCourse"), MainModelComu.class)
                        .build();

        mainAdapterComunicacion = new MainAdapterComunicacion(options);
        recyclerView.setAdapter(mainAdapterComunicacion);

        mImVwBack_AprendCurso_comu = findViewById(R.id.ImVwBack_AprendCurso_comu);
        mImVwBack_AprendCurso_comu.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityComunicacion.this, AprenderCursos.class);
            startActivity(i);
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterComunicacion.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterComunicacion.stopListening();
    }
}