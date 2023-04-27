package com.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
public class ResActivity4 extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tabComidas;
    TabItem tabBebidas;
    TabItem tabComplementos;

    ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res4);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        viewPager = (ViewPager) findViewById(R.id.vistaRes);

        tabComidas = (TabItem) findViewById(R.id.tabComidas);
        tabBebidas = (TabItem) findViewById(R.id.tabBebidas);
        tabComplementos = (TabItem) findViewById(R.id.tabComplementos);

        viewPagerAdapter =  new ViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0) {
                    Intent intent = new Intent(ResActivity4.this, comidaActivity4.class);
                    startActivity(intent);
                }
                if (tab.getPosition()==1) {
                    Intent intent = new Intent(ResActivity4.this, bebidaActivity4.class);
                    startActivity(intent);
                }
                if (tab.getPosition()==2) {
                    Intent intent = new Intent(ResActivity4.this, complementoActivity4.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

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