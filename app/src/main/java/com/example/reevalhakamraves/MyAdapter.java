package com.example.reevalhakamraves;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewholder> {

    Context context;

    ArrayList<User> list;

    public MyAdapter(Context context, ArrayList<User> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {

        User user = list.get(position);
        holder.foto.setText(user.getFoto());
        holder.nama.setText(user.getNama());
        holder.chat.setText(user.getChat());
        holder.tanggal.setText(user.getTanggal());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewholder extends RecyclerView.ViewHolder {

        TextView foto, nama, chat, tanggal;

        public MyViewholder(@NonNull View itemView) {
            super(itemView);

            foto = itemView.findViewById(R.id.foto_view);
            nama = itemView.findViewById(R.id.nama_view);
            chat = itemView.findViewById(R.id.chat_view);
            tanggal = itemView.findViewById(R.id.tanggal_view);

        }
    }
}
