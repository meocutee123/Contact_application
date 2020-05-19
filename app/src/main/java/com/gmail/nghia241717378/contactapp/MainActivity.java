package com.gmail.nghia241717378.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> list;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        recyclerView = findViewById(R.id.rView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));
        list.add(new Model("Thu Cúc", "14/2/1990","0123456789"));

        adapter = new Adapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
