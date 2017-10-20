package com.thinksbrain.testpost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thinksbrain.testpost.Objects.Trabajos;
import com.thinksbrain.testpost.Utils.Variables;

//Importaciones Necesarias
import java.util.ArrayList;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.thinksbrain.testpost.UI.TrabajoAdapter;



public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private TrabajoAdapter mAdapter;

    public  Trabajos[] vector_trabajos = Variables.trabajos;
    public ArrayList<Trabajos> list_trabajos = new ArrayList<>();

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recorriendo vector para cargarlo en la Lista
        for (int i=0; i<vector_trabajos.length; i++)
        {
            list_trabajos.add(vector_trabajos[i]);
        }
        //Asociando el Recycle View Trabajos

        Log.e("cantidad trabajos",""+list_trabajos.size());
        mRecyclerView = (RecyclerView)findViewById(R.id.recycle_view_trabajos);
        mRecyclerView.setHasFixedSize(true);



        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        mAdapter = new TrabajoAdapter(list_trabajos);
        mRecyclerView.setAdapter(mAdapter);
        //mAdapter.setDataSet(list_trabajos);
    }
}