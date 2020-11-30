package com.example.tour_guide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoriesFragmentPagerAdapter extends FragmentPagerAdapter {
    public CategoriesFragmentPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParkFragment();
            case 1:
                return new ArchitectureFragment();
        }
        return new Fragment();
    }

    @Override
    public int getCount() {
        return 2;
    }
}
