package com.jeong_woochang.sunrinthon.Retrofit;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

class TabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabcount=0;

    public TabPagerAdapter(FragmentManager fm, int tabcount) {
        super(fm);
        this.tabcount=tabcount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentSport();
            case 1:
                return new FragmentGame();
            case 2:
                return new FragmentETC();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
