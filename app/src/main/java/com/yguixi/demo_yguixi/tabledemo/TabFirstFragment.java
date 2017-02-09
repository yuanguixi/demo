package com.yguixi.demo_yguixi.tabledemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yguixi.demo_yguixi.R;

import java.util.ArrayList;
import java.util.List;


public class TabFirstFragment extends Fragment implements View.OnClickListener {
    private Context mContext;



    public TabFirstFragment() {
    }

    public static TabFirstFragment newInstance() {
        TabFirstFragment fragment = new TabFirstFragment();
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_first, container, false);
        initUI(view);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    /**
     * 初始化UI组件
     */
    private void initUI(View view) {
    }


    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.activity_base:
//                break;
//        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}