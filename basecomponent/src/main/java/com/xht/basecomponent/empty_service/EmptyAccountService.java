package com.xht.basecomponent.empty_service;

import com.xht.basecomponent.service.IAccountService;

/**
 * Created by xht on 2019/10/14.
 */
public class EmptyAccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
