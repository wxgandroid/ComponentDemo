package com.wxg.baselib;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */

public interface IAppService extends IProvider {


    void showAppToast();

    String getAppString();

}
