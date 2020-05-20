package com.gmail.nghia241717378.contactapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditActivity extends AppCompatActivity {
   EditText edtName, edtDOB, edtPhone;
    String txtName;
    String txtDOB;
    String txtPhone;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        edtName = findViewById(R.id.edtName);
        edtPhone = findViewById(R.id.edtPhone);
        edtDOB = findViewById(R.id.edtDOB);

        txtName = getIntent().getStringExtra("Name");
        txtDOB = getIntent().getStringExtra("DOB");
        txtPhone = getIntent().getStringExtra("Phone");

        edtName.setText(txtName);
        edtDOB.setText(txtDOB);
        edtPhone.setText(txtPhone);




    }
}
