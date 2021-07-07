package com.example.crudwithretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crudwithretrofit.R;
import com.example.crudwithretrofit.models.DataModel;

import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData>{
    private Context ctx;
    private List<DataModel>listData;

    public AdapterData(Context ctx, List<DataModel> listData) {
        this.ctx = ctx;
        this.listData = listData;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item,parent,false);
        HolderData holder = new HolderData(layout);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        DataModel dm=listData.get(position);

        holder.tv_id.setText(String.valueOf(dm.getId()));
        holder.tv_nama.setText(dm.getNama());
        holder.tv_kelas.setText(dm.getKelas());
    }

    @Override
    public int getItemCount() {
         return listData.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView tv_id,tv_nama,tv_kelas;

        public HolderData(@NonNull View itemView) {
            super(itemView);
            tv_id = itemView.findViewById(R.id.tv_id);
            tv_nama= itemView.findViewById(R.id.tv_nama);
            tv_kelas= itemView.findViewById(R.id.tv_kelas);
        }
    }
}
