package com.example.lv.layouttest;
//表格布局
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        //隐藏标题栏
        getSupportActionBar().hide();
    }
}
