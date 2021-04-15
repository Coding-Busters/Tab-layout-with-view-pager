package com.codingbusters.blogtablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {

    int no_of_tabs;

    public Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.no_of_tabs = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Chats();
            case 1:
                return new Status();
            case 2:
                return new Calls();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return no_of_tabs;
    }
}
