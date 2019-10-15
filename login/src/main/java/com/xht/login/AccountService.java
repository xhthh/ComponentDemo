package com.xht.login;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

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

    @Override
    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager fragmentManager, Bundle bundle, String tag) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        Fragment fragment = new UserFragment();
        transaction.add(containerId, fragment, tag);
        transaction.commit();

        return fragment;
    }
}
