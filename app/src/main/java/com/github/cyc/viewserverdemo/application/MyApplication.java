package com.github.cyc.viewserverdemo.application;

import android.app.Application;

import com.github.cyc.viewserverdemo.BuildConfig;

/**
 * Created by cyc on 2017/10/1.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 如果是Debug版本，那么才注册ActivityLifecycleCallbacks监听器
        if (BuildConfig.DEBUG) {
            registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksImpl(this));
        }
    }
}
