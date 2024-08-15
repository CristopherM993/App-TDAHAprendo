package com.example.tdahaprendo.CursoComunicacion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterComunicacion extends FirebaseRecyclerAdapter<MainModelComu,MainAdapterComunicacion.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterComunicacion(@NonNull FirebaseRecyclerOptions<MainModelComu> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelComu model) {
        holder.mTitulocomu.setText(model.getTitulocomu());
        holder.mDescripcomu.setText(model.getDescripcomu());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursocomu,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTitulocomu, mDescripcomu;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitulocomu = (TextView) itemView.findViewById(R.id.txtV_titulo_comu);
            mDescripcomu = (TextView) itemView.findViewById(R.id.txtV_decrip_comu);
        }
    }




}
