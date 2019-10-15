package com.xht.basecomponent.service;

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


}
