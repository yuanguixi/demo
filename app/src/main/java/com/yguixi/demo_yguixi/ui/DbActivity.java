package com.yguixi.demo_yguixi.ui;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yguixi.demo_yguixi.R;
import com.yguixi.demo_yguixi.util.DbUtil;

public class DbActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DbUtil util = new DbUtil(this);
        SQLiteDatabase db = util.getReadableDatabase();
    }
}
