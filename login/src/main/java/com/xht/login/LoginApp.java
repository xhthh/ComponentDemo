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
