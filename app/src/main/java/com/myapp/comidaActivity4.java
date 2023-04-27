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

public class comidaActivity4 extends AppCompatActivity {

    private ListView comida4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida4);

        comida4 = (ListView) findViewById(R.id.comida4);

        String items[]=new String[4];
        items[0]="comida4 A";
        items[1]="comida4 B";
        items[2]="comida4 C";
        items[3]="comida4 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        comida4.setAdapter(adapter);

        comida4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(comidaActivity4.this, comida1dActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(comidaActivity4.this, comida2dActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(comidaActivity4.this, comida3dActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(comidaActivity4.this, comida4dActivity.class);
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