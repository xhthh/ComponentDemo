package com.xht.share;

import android.app.Application;

import com.xht.base.BaseApp;

/**
 * Created by xht on 2019/10/14.
 */
public class ShareApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {

    }

    @Override
    public void initModuleData(Application application) {

    }
}
