package com.example.donut_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Donut> arrayList=new ArrayList<>();
        for(int i=0;i<3;i++){
            arrayList.add(new Donut("Tasty Donut","$10.00",R.drawable.donut_yellow));
            arrayList.add(new Donut("Pink Donut","$20.00",R.drawable.tasty_donut));
            arrayList.add(new Donut("Floating Donut","$30.00",R.drawable.green_donut));
            arrayList.add(new Donut("Tasty Donut","$40.00",R.drawable.donut_red));
        }

        mRecyclerView=findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new DonutAdapter(this,arrayList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);



    }
}