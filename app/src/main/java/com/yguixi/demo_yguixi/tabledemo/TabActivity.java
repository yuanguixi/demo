package com.yguixi.demo_yguixi.tabledemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.OnTabSelectListener;
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
     * 初始化Tabs组件
     */
//    private void initTabs() {
//        mTabLayout = (CommonTabLayout) findViewById(R.id.tab);
//        selectedColor = getResources().getColor(R.color.colorPrimary);
//        for (int i = 0; i < mTitles.length; i++) {
//            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
//        }
//        mTabLayout.setTabData(mTabEntities);
//        mTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
//            @Override
//            public void onTabSelect(int position) {
//                    mViewPager.setCurrentItem(position);
//                    mTabLayout.setCurrentTab(position);
//            }
//
//            @Override
//            public void onTabReselect(int position) {
//            }
//        });
//    }
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
