package com.example.tdahaprendo.CursoComputo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterComputo extends FirebaseRecyclerAdapter<MainModelComputo,MainAdapterComputo.myViewHolder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterComputo(@NonNull FirebaseRecyclerOptions<MainModelComputo> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelComputo model) {
        holder.mTitulocomputo.setText(model.getTitulocomputo());
        holder.mDescripcomputo.setText(model.getDescripcomputo());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursocomputo,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTitulocomputo, mDescripcomputo;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitulocomputo = (TextView) itemView.findViewById(R.id.txtV_titulo_computo);
            mDescripcomputo = (TextView) itemView.findViewById(R.id.txtV_decrip_computo);
        }
    }

}
