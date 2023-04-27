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

public class comidaActivity1 extends AppCompatActivity {

    private ListView comida1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida1);

        comida1 = (ListView) findViewById(R.id.comida1);

        String items[]=new String[4];
        items[0]="comida1 A";
        items[1]="comida1 B";
        items[2]="comida1 C";
        items[3]="comida1 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        comida1.setAdapter(adapter);

        comida1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(comidaActivity1.this, comida1aActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(comidaActivity1.this, comida2aActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(comidaActivity1.this, comida3aActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(comidaActivity1.this, comida4aActivity.class);
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
    }
}