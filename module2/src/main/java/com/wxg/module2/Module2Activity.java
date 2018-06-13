package com.wxg.module2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.wxg.baselib.IAppService;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */
@Route(path = "/module2/Module2Activity")
public class Module2Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_test;

    private Button btn_test;

    private Button btn_test2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
        tv_test = findViewById(R.id.tv_test);
        String key = getIntent().getStringExtra("key");
        tv_test.setText(tv_test.getText() + key);

        btn_test = findViewById(R.id.btn_test);
        btn_test2 = findViewById(R.id.btn_test2);


        btn_test.setOnClickListener(this);
        btn_test2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_test) {
            //调用app模块中的方法
            IAppService navigation = ARouter.getInstance().navigation(IAppService.class);
            navigation.showAppToast();
        } else if (v.getId() == R.id.btn_test2) {
            //调用app方法获取字符串
            IAppService navigation1 = ARouter.getInstance().navigation(IAppService.class);
            String appString = navigation1.getAppString();
            tv_test.setText(appString);
        }
    }
}
