package com.example.tdahaprendo.CursoPersonal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tdahaprendo.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapterPersonal extends FirebaseRecyclerAdapter<MainModelPersonal, MainAdapterPersonal.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapterPersonal(@NonNull FirebaseRecyclerOptions<MainModelPersonal> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModelPersonal model) {
        holder.mTitulopersonal.setText(model.getTitulopersonal());
        holder.mDescrippersonal.setText(model.getDescrippersonal());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cursopersonal,parent, false);
        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView mTitulopersonal, mDescrippersonal;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            mTitulopersonal = (TextView) itemView.findViewById(R.id.txtV_titulo_personal);
            mDescrippersonal = (TextView) itemView.findViewById(R.id.txtV_decrip_personal);
        }
    }
}
