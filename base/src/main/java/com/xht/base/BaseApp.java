package com.xht.base;

import android.app.Application;

/**
 * Created by xht on 2019/10/14.
 */
public abstract class BaseApp extends Application {

    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);

}
