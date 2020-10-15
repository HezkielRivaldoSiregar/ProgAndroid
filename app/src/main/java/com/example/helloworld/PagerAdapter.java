package com.example.helloworld;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.helloworld.FragmentBottom;
import com.example.helloworld.FragmentTop;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentTop();
            case 1:
                return new FragmentBottom();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}