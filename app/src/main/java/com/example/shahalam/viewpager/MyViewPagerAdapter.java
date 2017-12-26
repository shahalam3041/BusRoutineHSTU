package com.example.shahalam.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ShahAlam on 26-Dec-17.
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    String fragments[] = {"Campus-Town", "Town-Campus"};

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                 return new MyFragmentOne();
            case 1:
                return new MyFragmentTwo();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments[position];
    }
}
