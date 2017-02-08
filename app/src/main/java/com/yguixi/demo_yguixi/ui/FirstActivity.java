package com.yguixi.demo_yguixi.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yguixi.demo_yguixi.R;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        setBackButton(true);
        setTitle("返回");
    }
}
