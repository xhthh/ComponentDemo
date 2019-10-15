package com.xht.login;

import com.xht.basecomponent.service.IAccountService;

/**
 * Created by xht on 2019/10/14.
 */
public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return AccountUtils.userInfo != null;
    }

    @Override
    public String getAccountId() {
        return AccountUtils.userInfo == null ? null : AccountUtils.userInfo.getAccountId();
    }
}
