package com.gmail.nghia241717378.contactapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Model> list;
    //private Context context;

    Adapter(List<Model> list, Context context) {
        this.list = list;
        //this.context = context;
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
                intent.putExtra("Name", model.getTxtName());
                intent.putExtra("DOB", model.getTxtDOB());
                intent.putExtra("Phone", model.getTxtPhone());
                v.getContext().startActivity(intent);
            }
        });

        holder.imgViewPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission(v.getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                }else {
                    v.getContext().startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + model.getTxtPhone())));
                }
            }
        });

        holder.imgViewMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", model.getTxtPhone(), null));
                v.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtODB, txtName, txtPhone;
        ImageView imgViewEdit, imgViewPhone, imgViewMessage;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtODB = itemView.findViewById(R.id.txtDOB);
            txtPhone = itemView.findViewById(R.id.txtPhone);
            imgViewEdit = itemView.findViewById(R.id.imgViewEdit);
            imgViewPhone = itemView.findViewById(R.id.imgViewPhone);
            imgViewMessage = itemView.findViewById(R.id.imgViewMessage);

        }
    }
}
