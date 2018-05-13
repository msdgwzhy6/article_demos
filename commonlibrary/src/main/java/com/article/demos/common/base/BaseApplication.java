package com.article.demos.common.base;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.article.demos.common.BuildConfig;

/**
 * @author lxy
 * @date 2018/5/13
 */

public class BaseApplication extends Application {

    private static BaseApplication sInstance;
    public static Context sContext;

    public static BaseApplication getInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        sContext = this.getApplicationContext();
        if (!BuildConfig.isRelease) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
