package com.yguixi.demo_yguixi.tabledemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.CommonTabLayout;
import com.yguixi.demo_yguixi.R;
import com.yguixi.demo_yguixi.ui.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class TabActivity extends BaseActivity {
    private List<Fragment> mFragments;
    private static TabFirstFragment firstFragment;
    private static TabSecondFragment secondFragment;
    private ViewPager mViewPager;
    private CommonTabLayout mTabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        initViewPager();
    }
    /**
     * ViewPager组件初始化
     */
    private void initViewPager() {
        mFragments = new ArrayList<>();
        firstFragment = TabFirstFragment.newInstance();
        secondFragment = TabSecondFragment.newInstance();
        mFragments.add(firstFragment);
        mFragments.add(secondFragment);
        mViewPager = (ViewPager) findViewById(R.id.vp_tab);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//                mTabLayout.setCurrentTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
            mViewPager.setCurrentItem(0);
    }
    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
    }
}
