package com.thinksbrain.testpost.UI;

/**
 * Created by AMILKAR on 20/10/2017.
 */

        import android.support.v7.widget.RecyclerView;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;

        import com.thinksbrain.testpost.Objects.Trabajos;
        import com.thinksbrain.testpost.R;

        import java.util.ArrayList;

public class TrabajoAdapter extends RecyclerView.Adapter<TrabajoAdapter.ViewHolder> {

    private ArrayList<Trabajos> mDataSet;

    public TrabajoAdapter(ArrayList<Trabajos> mDataSet) {
        this.mDataSet = mDataSet;
        Log.e("cantidad trabajos",""+mDataSet.size());
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titulo,correo,costo;
        ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView) itemView.findViewById(R.id.titulo);
            correo = (TextView) itemView.findViewById(R.id.correo);
            costo = (TextView) itemView.findViewById(R.id.costo);
        }
    }

    public TrabajoAdapter() {
        mDataSet = new ArrayList<>();
    }

    public void setDataSet(ArrayList<Trabajos> dataSet)
    {
        mDataSet = dataSet;
        notifyDataSetChanged();
    }


    @Override
    public TrabajoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                        int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.trabajo_view, parent, false);
        ViewHolder pvh = new ViewHolder(v);
        return pvh;

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.titulo.setText(mDataSet.get(i).getTitulo());
        holder.correo.setText(mDataSet.get(i).getEmail());
        holder.costo.setText(String.valueOf(mDataSet.get(i).getSalario()));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}