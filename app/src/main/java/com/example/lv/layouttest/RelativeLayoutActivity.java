package com.example.lv.layouttest;
//相对布局
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        //隐藏标题栏
        getSupportActionBar().hide();
    }
}
