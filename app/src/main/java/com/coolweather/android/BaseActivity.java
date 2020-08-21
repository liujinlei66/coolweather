package com.coolweather.android;

import android.content.Context;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class BaseActivity extends AppCompatActivity {
    /**
     *简易Toast小函数
     */
    public void makeTips(Context context, String content){
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show();
    }
}
