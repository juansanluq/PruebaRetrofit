package com.example.pruebaapi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<Cerveza> dataList;
    private Context context;

    public CustomAdapter(Context context,List<Cerveza> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txvDep, txvNombre, txvLoc;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txvDep = mView.findViewById(R.id.txvDep);
            txvNombre = mView.findViewById(R.id.txvNombre);
            txvLoc = mView.findViewById(R.id.txvLoc);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recicler_view_personalizado, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.txvDep.setText(Integer.toString(dataList.get(position).getDept_no()));
        holder.txvNombre.setText(dataList.get(position).getDnombre());
        holder.txvLoc.setText(dataList.get(position).getLoc());


    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
