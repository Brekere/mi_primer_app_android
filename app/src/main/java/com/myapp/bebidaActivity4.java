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

public class bebidaActivity4 extends AppCompatActivity {

    private ListView bebida4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebida4);

        bebida4 = (ListView) findViewById(R.id.bebida4);

        String items[]=new String[4];
        items[0]="bebida4 A";
        items[1]="bebida4 B";
        items[2]="bebida4 C";
        items[3]="bebida4 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        bebida4.setAdapter(adapter);

        bebida4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /**Intent intent = new Intent(MainActivity.this, OtraActivity.class);
                 startActivity(intent);**/
                if(position==0){
                    Intent intent = new Intent(bebidaActivity4.this, bebida1dActivity.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(bebidaActivity4.this, bebida2dActivity.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(bebidaActivity4.this, bebida3dActivity.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(bebidaActivity4.this, bebida4dActivity.class);
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