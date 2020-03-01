package com.example.shoesstore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvShoes;
    private ArrayList<ShoesModel> shoesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvShoes = findViewById(R.id.activitymain_rv);
        rvShoes.setHasFixedSize(true);

        shoesList.addAll(ShoesData.getShoeList());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvShoes.setLayoutManager(new LinearLayoutManager(this));
        ShoesAdapter shoesAdapter = new ShoesAdapter(this);
        shoesAdapter.setShoeList(shoesList);
        rvShoes.setAdapter(shoesAdapter);
    }
}
