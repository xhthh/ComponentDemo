package com.xht.basecomponent.service;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * Created by xht on 2019/10/14.
 */
public interface IAccountService {

    /**
     * 是否已经登录
     *
     * @return
     */
    boolean isLogin();


    /**
     * 获取登录用户的 AccountId
     *
     * @return
     */
    String getAccountId();

    /**
     * 创建 UserFragment
     * @param activity
     * @param containerId
     * @param fragmentManager
     * @param bundle
     * @param tag
     * @return
     */
    Fragment newUserFragment(Activity activity, int containerId, FragmentManager fragmentManager, Bundle bundle, String tag);

}
