package application;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */

public class Module3Application extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(this);

    }
}
