package com.example.lv.layouttest;
//线性布局
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        //隐藏标题栏
        getSupportActionBar().hide();
    }
}
