package com.example.lv.layouttest;


//题目要求：分别以线性布局、相对布局、表格布局实现登录界面设置
//主要做法：MainActivity对应的布局文件里面放置三个按钮，通过对按钮点击事件进行监听来进行跳转
//新建3个Activity，对应MainActivity里3个按钮的点击
//新建的3个Activity的布局文件即为采用不同的布局方式编写

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //写这个方法来响应按钮点击事件
    //如果在onCreate里面注册监听，则需要三个都要写，会造成代码冗余
    //通过switch语句以及按钮的ID来响应点击
    public void buttonClick (View v){
            switch (v.getId()) {
                case R.id.linearLayout:
                    Intent intent1 = new Intent(MainActivity.this, LinearLayoutActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.relativeLayout:
                    Intent intent2 = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.tableLayout:
                    Intent intent3 = new Intent(MainActivity.this, TableLayoutActivity.class);
                    startActivity(intent3);
                    break;
                default:
                    break;
            }

        }


}
