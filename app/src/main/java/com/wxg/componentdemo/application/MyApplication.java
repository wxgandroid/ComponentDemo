package com.wxg.componentdemo.application;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        Log.e("TAG", "初始化ARouter");

        ARouter.openDebug();
        ARouter.openLog();

        ARouter.init(this);
    }
}
