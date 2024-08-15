package com.example.tdahaprendo.CursoCiencia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterCiencia extends FirebaseRecyclerAdapter<MainModelCiencia,MainAdapterCiencia.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterCiencia(@NonNull FirebaseRecyclerOptions<MainModelCiencia> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelCiencia model) {
        holder.mTitulociencia.setText(model.getTitulociencia());
        holder.mDescripciencia.setText(model.getDescripciencia());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursociencia,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTitulociencia, mDescripciencia;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitulociencia = (TextView) itemView.findViewById(R.id.txtV_titulo_ciencia);
            mDescripciencia = (TextView) itemView.findViewById(R.id.txtV_decrip_ciencia);
        }
    }
}
