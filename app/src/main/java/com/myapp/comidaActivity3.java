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

public class comidaActivity3 extends AppCompatActivity {

    private ListView comida3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida3);

        comida3 = (ListView) findViewById(R.id.comida3);

        String items[]=new String[4];
        items[0]="comida3 A";
        items[1]="comida3 B";
        items[2]="comida3 C";
        items[3]="comida3 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        comida3.setAdapter(adapter);

        comida3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(comidaActivity3.this, comida1cActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(comidaActivity3.this, comida2cActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(comidaActivity3.this, comida3cActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(comidaActivity3.this, comida4cActivity.class);
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