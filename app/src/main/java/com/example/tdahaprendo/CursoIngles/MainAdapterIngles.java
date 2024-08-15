package com.example.tdahaprendo.CursoIngles;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterIngles extends FirebaseRecyclerAdapter<MainModelIngles,MainAdapterIngles.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterIngles(@NonNull FirebaseRecyclerOptions<MainModelIngles> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelIngles model) {
        holder.mTituloingles.setText(model.getTituloingles());
        holder.mDescripingles.setText(model.getDescripingles());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursoingles,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTituloingles, mDescripingles;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTituloingles = (TextView) itemView.findViewById(R.id.txtV_titulo_ingles);
            mDescripingles = (TextView) itemView.findViewById(R.id.txtV_decrip_ingles);
        }
    }
}
