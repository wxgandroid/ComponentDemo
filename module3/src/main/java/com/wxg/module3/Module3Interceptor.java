package com.wxg.module3;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

/**
 * @author WangXuguang
 * @date 2018/6/13.
 */
@Interceptor(priority = 10, name = "Module3Interceptor")
public class Module3Interceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if ("/module3/Module3Activity".equals(postcard.getPath())) {
            Log.e("TAG", "触发了拦截器");
            postcard.withString("key", "我是触发拦截器以后的");
        }
        callback.onContinue(postcard);
    }

    @Override
    public void init(Context context) {
    }
}
