package com.example.tdahaprendo.CursoReligion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tdahaprendo.CursoMate.MainAdapterMate;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterReligion extends FirebaseRecyclerAdapter<MainModelReligion, MainAdapterReligion.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterReligion(@NonNull FirebaseRecyclerOptions<MainModelReligion> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelReligion model) {
        holder.mTituloreligion.setText(model.getTituloreligion());
        holder.mDescripreligion.setText(model.getDescripreligion());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursoreligion,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTituloreligion, mDescripreligion;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTituloreligion= (TextView) itemView.findViewById(R.id.txtV_titulo_religion);
            mDescripreligion = (TextView) itemView.findViewById(R.id.txtV_decrip_religion);
        }
    }
}
