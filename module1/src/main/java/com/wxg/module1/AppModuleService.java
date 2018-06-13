package com.wxg.module1;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wxg.baselib.IAppService;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */
@Route(path = "/app/AppModuleService")
public class AppModuleService implements IAppService {

    private Context mContext;

    @Override
    public void showAppToast() {
        Toast.makeText(mContext, "app模块中的toast", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getAppString() {
        return "app模块中返回的数据";
    }

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
