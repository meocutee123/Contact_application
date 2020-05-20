package com.gmail.nghia241717378.contactapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<Model> list;
    Context context;

    public Adapter(List<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_custom, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Model model = list.get(position);
        holder.txtName.setText(model.getTxtName());
        holder.txtODB.setText(model.getTxtDOB());
        holder.txtPhone.setText(model.getTxtPhone());
        holder.imgViewEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), EditActivity.class);
                intent.putExtra("Name",model.getTxtName());
                intent.putExtra("DOB",model.getTxtDOB());
                intent.putExtra("Phone",model.getTxtPhone());
                v.getContext().startActivity(intent);
                Toast.makeText(context, model.getTxtPhone(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtODB, txtName, txtPhone;
        ImageView imgViewEdit;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtODB = itemView.findViewById(R.id.txtDOB);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            imgViewEdit = itemView.findViewById(R.id.imgViewEdit);
        }
    }
}
