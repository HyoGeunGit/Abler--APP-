package com.jeong_woochang.sunrinthon.Retrofit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jeong_woochang.sunrinthon.R;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

public class FragmentPlay extends Fragment {
    public FragmentPlay(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout=(LinearLayout)inflater.inflate(R.layout.fragment_play,container,false);
        ViewPager viewPager=(ViewPager)layout.findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) layout.findViewById(R.id.tab);
        tabLayout.addTab(tabLayout.newTab().setText("스포츠"));
        tabLayout.addTab(tabLayout.newTab().setText("게임"));
        tabLayout.addTab(tabLayout.newTab().setText("기타"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        TabPagerAdapter pagerAdapter = new TabPagerAdapter(((FragmentActivity)getContext()).getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return layout;
    }
}
