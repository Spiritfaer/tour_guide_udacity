package com.example.tour_guide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoriesFragmentPagerAdapter extends FragmentPagerAdapter {

    private final String[] mTabTitle;

    public CategoriesFragmentPagerAdapter(@NonNull FragmentManager fm, String[] tabTitle) {
        super(fm);
        mTabTitle = tabTitle;
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitle[position];
    }
}
