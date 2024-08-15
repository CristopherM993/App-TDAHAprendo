package com.example.tdahaprendo.CursoCiencia;

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

public class MainActivityCiencia extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapterCiencia mainAdapterCiencia;
    ImageView mImVwBack_AprendCurso_ciencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ciencia);

        recyclerView = findViewById(R.id.recyvw_ciencia);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<MainModelCiencia> options =
                new FirebaseRecyclerOptions.Builder<MainModelCiencia>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("CursosPrincipales").child("CienciaCourse"), MainModelCiencia.class)
                        .build();

        mainAdapterCiencia = new MainAdapterCiencia(options);
        recyclerView.setAdapter(mainAdapterCiencia);

        mImVwBack_AprendCurso_ciencia = findViewById(R.id.ImVwBack_AprendCurso_Ciencia);
        mImVwBack_AprendCurso_ciencia.setOnClickListener(v -> {
            Intent i = new Intent(MainActivityCiencia.this, AprenderCursos.class);
            startActivity(i);
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mainAdapterCiencia.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainAdapterCiencia.stopListening();
    }
}