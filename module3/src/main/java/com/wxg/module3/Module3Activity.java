package com.wxg.module3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */
@Route(path = "/module3/Module3Activity")
public class Module3Activity extends AppCompatActivity {

    private TextView tv_test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3);
        tv_test = findViewById(R.id.tv_test);
        tv_test.setText(tv_test.getText() + getIntent().getStringExtra("key"));
    }
}
