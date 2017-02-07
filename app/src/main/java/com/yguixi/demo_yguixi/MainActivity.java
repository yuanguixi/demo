package com.yguixi.demo_yguixi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yguixi.demo_yguixi.ui.FirstActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    public void initUI() {
        Button btn = (Button) findViewById(R.id.animal);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.animal:
                Intent intent = new Intent();
                intent.setClass(this, FirstActivity.class);
                startActivity(intent);
        }
    }
}
