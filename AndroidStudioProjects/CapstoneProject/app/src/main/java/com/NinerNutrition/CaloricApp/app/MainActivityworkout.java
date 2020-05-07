package com.NinerNutrition.CaloricApp.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivityworkout extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;
    private ArrayList<com.NinerNutrition.CaloricApp.app.Exercises> wodList;
    private ArrayList<String> titleList;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lv);

        wodList = com.NinerNutrition.CaloricApp.app.DataHelper.loadExercises(this);
        titleList = new ArrayList<>();

        for (int i = 0; i < wodList.size(); i++) {
            String str = wodList.get(i).getTitle();
            titleList.add(str);
        }

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titleList);
        lv.setAdapter((ListAdapter) adapter);

        lv.setOnItemClickListener(this);
    }
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l){
                Intent intent = new Intent(com.NinerNutrition.CaloricApp.app.MainActivityworkout.this, DetailActivity.class);
                String title = wodList.get(pos).getTitle();
                String wod = wodList.get(pos).getWod();

                intent.putExtra( "EXTRA_TITLE", title);
                intent.putExtra( "EXTRA_WOD", wod);

                startActivity(intent);

        }

}

