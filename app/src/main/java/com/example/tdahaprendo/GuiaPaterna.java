package com.example.tdahaprendo;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tdahaprendo.GuiaPaternaTDAH.AdapterGuiaPaterna;
import com.example.tdahaprendo.GuiaPaternaTDAH.Guiaparapadres;
import com.example.tdahaprendo.professTDAH.Profesionales;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GuiaPaterna extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    AdapterGuiaPaterna mAdapterGuiaPaterna;
    ArrayList<Guiaparapadres> list;
    ImageView mbotonregresargp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_paterna);

        recyclerView = findViewById(R.id.listadeconsejosdeGP);
        database = FirebaseDatabase.getInstance().getReference("GuiaParaPadres");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mbotonregresargp = (ImageView) findViewById(R.id.ImVwregresarDashGP);

        list = new ArrayList<>();
        mAdapterGuiaPaterna = new AdapterGuiaPaterna(this, list);
        recyclerView.setAdapter(mAdapterGuiaPaterna);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren()){

                    Guiaparapadres guiaparapadres = dataSnapshot.getValue(Guiaparapadres.class);
                    list.add(guiaparapadres);
                }
                mAdapterGuiaPaterna.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mbotonregresargp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GuiaPaterna.this, Bienvenida.class));
                finish();
            }
        });
    }

}