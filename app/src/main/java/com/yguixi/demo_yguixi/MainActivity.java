package com.yguixi.demo_yguixi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yguixi.demo_yguixi.tabledemo.TabActivity;
import com.yguixi.demo_yguixi.ui.BaseActivity;
import com.yguixi.demo_yguixi.ui.DbActivity;
import com.yguixi.demo_yguixi.ui.FirstActivity;
import com.yguixi.demo_yguixi.ui.PopActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI() {
        Button btn = (Button) findViewById(R.id.animal);
        btn.setOnClickListener(this);
        Button btnTab = (Button) findViewById(R.id.btn_tabdemo);
        btnTab.setOnClickListener(this);
        Button btnPop = (Button) findViewById(R.id.btn_pop);
        btnPop.setOnClickListener(this);
        Button btnDb = (Button) findViewById(R.id.btn_db);
        btnDb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.animal:
                goActivity(FirstActivity.class);
                break;
            case R.id.btn_tabdemo:
                goActivity(TabActivity.class);
                break;
            case R.id.btn_pop:
                goActivity(PopActivity.class);
                break;
            case R.id.btn_db:
                goActivity(DbActivity.class);
                break;
        }
    }
}
