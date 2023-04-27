package com.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class comidaActivity2 extends AppCompatActivity {

    private ListView comida2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida2);

        comida2 = (ListView) findViewById(R.id.comida2);

        String items[]=new String[4];
        items[0]="comida2 A";
        items[1]="comida2 B";
        items[2]="comida2 C";
        items[3]="comida2 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        comida2.setAdapter(adapter);

        comida2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(comidaActivity2.this, comida1bActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(comidaActivity2.this, comida2bActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(comidaActivity2.this, comida3bActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(comidaActivity2.this, comida4bActivity.class);
                    startActivity(intent);
                }
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
}}