package ru.startandroid.viewpagetest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 10.07.2017.
 */

public class TestViewPagerAdapter extends FragmentPagerAdapter{

    public TestViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new EventFragment();
            case 1:
                return new TestFragment();

        }
        return new TestFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
