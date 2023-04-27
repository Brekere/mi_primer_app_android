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

public class complementoActivity1 extends AppCompatActivity {

    private ListView complemento1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complemento1);

        complemento1 = (ListView) findViewById(R.id.complemento1);

        String items[]=new String[4];
        items[0]="complemento1 A";
        items[1]="complemento1 B";
        items[2]="complemento1 C";
        items[3]="complemento1 D";

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);

        complemento1.setAdapter(adapter);

        complemento1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                /**Intent intent = new Intent(MainActivity.this, OtraActivity.class);
                 startActivity(intent);**/
                if(position==0){
                    Intent intent = new Intent(complementoActivity1.this, ResActivity1.class);
                    startActivity(intent);
                }
                if (position==1){
                    Intent intent = new Intent(complementoActivity1.this, ResActivity2.class);
                    startActivity(intent);
                }
                if (position==2){
                    Intent intent = new Intent(complementoActivity1.this, ResActivity3.class);
                    startActivity(intent);
                }
                if (position==3){
                    Intent intent = new Intent(complementoActivity1.this, ResActivity4.class);
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