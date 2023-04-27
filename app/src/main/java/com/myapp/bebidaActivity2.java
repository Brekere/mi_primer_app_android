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

public class bebidaActivity2 extends AppCompatActivity {
    private ListView bebida2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida2);

        bebida2 = (ListView) findViewById(R.id.bebida2);

        String items[]=new String[4];
        items[0]="bebida2 A";
        items[1]="bebida2 B";
        items[2]="bebida2 C";
        items[3]="bebida2 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        bebida2.setAdapter(adapter);

        bebida2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                if(position==0){
                    Intent intent = new Intent(bebidaActivity2.this, bebida1bActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(bebidaActivity2.this, bebida2bActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(bebidaActivity2.this, bebida3bActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(bebidaActivity2.this, bebida4bActivity.class);
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