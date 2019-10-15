package com.xht.basecomponent.empty_service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

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

    @Override
    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager fragmentManager, Bundle bundle, String tag) {
        return null;
    }
}
