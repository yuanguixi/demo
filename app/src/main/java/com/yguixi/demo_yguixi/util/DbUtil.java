package com.yguixi.demo_yguixi.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/6/1.
 */

public class DbUtil extends SQLiteOpenHelper {
    public DbUtil(Context context) {
        super(context, "yguixi.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table user (_id integer primary key autoincrement,name varchar(20)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
