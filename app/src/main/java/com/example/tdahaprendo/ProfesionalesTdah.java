package com.example.tdahaprendo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tdahaprendo.professTDAH.AdapterProfesionales;
import com.example.tdahaprendo.professTDAH.Profesionales;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ProfesionalesTdah extends AppCompatActivity {
    RecyclerView recyclerView;
    DatabaseReference database;
    AdapterProfesionales myAdapterProfesionales;
    ArrayList<Profesionales> list;
    ImageView mImVwregresarbienvenida, mRefreshProfesio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesionales_tdah);

        recyclerView = findViewById(R.id.userList);
        database = FirebaseDatabase.getInstance().getReference("ProfesionalesTDAH");
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mImVwregresarbienvenida = findViewById(R.id.ImVwregresarbienvenida);
        mRefreshProfesio = findViewById(R.id.refreshProfesional);

        mRefreshProfesio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfesionalesTdah.this, ProfesionalesTdah.class));
            }
        });

        list = new ArrayList<>();
        myAdapterProfesionales = new AdapterProfesionales(this,list);
        recyclerView.setAdapter(myAdapterProfesionales);

        database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren()){

                    Profesionales profes = dataSnapshot.getValue(Profesionales.class);
                    list.add(profes);
                }
                myAdapterProfesionales.notifyDataSetChanged();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        mImVwregresarbienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfesionalesTdah.this, Bienvenida.class);
                startActivity(intent);
            }
        });

    }
}