package com.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    int behavior;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior){
        super(fm,behavior);
        this.behavior = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position){
        switch(position){
            case 0:
                return new tabComidas();
            case 1:
                return new tabBebidas();
            case 2:
                return new tabComplementos();
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 0;
    }
}
