package com.example.tdahaprendo.professTDAH;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tdahaprendo.R;

import java.util.ArrayList;

public class AdapterProfesionales extends RecyclerView.Adapter<AdapterProfesionales.MyViewHolder> {

    Context context;
    ArrayList<Profesionales> list;

    public AdapterProfesionales(Context context, ArrayList<Profesionales> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_profesionales, parent, false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Profesionales profes = list.get(position);
        holder.Nombre.setText(profes.getNombre());
        holder.Especialidad.setText(profes.getEspecialidad());
        holder.Dirección.setText(profes.getDirección());
        holder.Consulta.setText(profes.getConsulta());
        holder.Teléfono.setText(profes.getTeléfono());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Nombre, Especialidad, Dirección, Consulta, Teléfono;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Nombre = itemView.findViewById(R.id.tvNombre);
            Especialidad = itemView.findViewById(R.id.tvEspecialidad);
            Dirección = itemView.findViewById(R.id.tvDireccion);
            Consulta = itemView.findViewById(R.id.tvConsulta);
            Teléfono = itemView.findViewById(R.id.tvTelefono);

        }
    }
}
