package com.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private ListView Restaurantes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Restaurantes = (ListView) findViewById(R.id.Restaurantes);

        String items[]=new String[4];
        items[0]="Restaurante A";
        items[1]="Restaurante B";
        items[2]="Restaurante C";
        items[3]="Restaurante D";

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        Restaurantes.setAdapter(adapter);

        Restaurantes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(MainActivity.this, ResActivity1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(MainActivity.this, ResActivity2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(MainActivity.this, ResActivity3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(MainActivity.this, ResActivity4.class);
                    startActivity(intent);
                }
            }
        });

    }
}