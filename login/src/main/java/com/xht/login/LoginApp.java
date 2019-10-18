package com.xht.login;

import android.app.Application;

import com.xht.base.BaseApp;
import com.xht.basecomponent.ServiceFactory;

/**
 * Created by xht on 2019/10/14.
 */
public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();

        //test 在组件单独运行时，且需要与其他组件进行通信时，初始化ARouter，并且引用其他组件的aar
        //ARouter.init(this);

        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
