package com.example.tdahaprendo.GuiaPaternaTDAH;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tdahaprendo.R;
import com.example.tdahaprendo.professTDAH.AdapterProfesionales;

import java.util.ArrayList;

public class AdapterGuiaPaterna extends RecyclerView.Adapter<AdapterGuiaPaterna.MyViewHolder> {

    Context context;
    ArrayList<Guiaparapadres> list;

    public AdapterGuiaPaterna(Context context, ArrayList<Guiaparapadres> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.item_guiapaterna, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Guiaparapadres guiaparapadres = list.get(position);
        holder.titulogp.setText(guiaparapadres.getTituloconsejo());
        holder.descriptiongp.setText(guiaparapadres.getDescripcionconsejo());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulogp, descriptiongp;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulogp = itemView.findViewById(R.id.tvTituloGuiaPaterna);
            descriptiongp = itemView.findViewById(R.id.TvDescipcion);

        }
    }
}
