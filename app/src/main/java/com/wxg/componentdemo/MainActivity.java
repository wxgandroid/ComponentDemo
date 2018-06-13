package com.wxg.componentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {


    private Button btn_test1;
    private Button btn_test2;
    private Button btn_test3;
    private Button btn_test4;
    private Button btn_test5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_test1 = findViewById(R.id.btn_test1);
        btn_test2 = findViewById(R.id.btn_test2);
        btn_test3 = findViewById(R.id.btn_test3);
        btn_test4 = findViewById(R.id.btn_test4);
        btn_test5 = findViewById(R.id.btn_test5);

    }

    /**
     * 在xml文件中注册点击事件
     *
     * @param view
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_test1:
                ARouter.getInstance().build("/module1/Module1Activity").navigation();
                break;
            case R.id.btn_test2:
                ARouter.getInstance().build("/module2/Module2Activity")
                        .withString("key", "携带参数跳转")
                        .navigation();
                break;
            case R.id.btn_test3:
                ARouter.getInstance().build("/module3/Module3Activity").navigation();
                break;
            case R.id.btn_test4:

                break;
            case R.id.btn_test5:

                break;
            default:
                break;

        }


    }


}
