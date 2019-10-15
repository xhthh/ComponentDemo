package com.xht.basecomponent;

import com.xht.basecomponent.empty_service.EmptyAccountService;
import com.xht.basecomponent.service.IAccountService;

/**
 * Created by xht on 2019/10/14.
 */
public class ServiceFactory {

    private IAccountService accountService;

    /**
     * 禁止外部创建 ServiceFactory 对象
     */
    private ServiceFactory() {
    }

    /**
     * 通过静态内部类的方式实现 ServiceFactory 的单例
     *
     * @return
     */
    public static ServiceFactory getInstance() {
        return Holder.instance;
    }

    private static class Holder {
        private static ServiceFactory instance = new ServiceFactory();
    }

    /**
     * 返回 Login 组件的 Service 实例
     *
     * @return
     */
    public IAccountService getAccountService() {
        if (accountService == null) {
            accountService = new EmptyAccountService();
        }
        return accountService;
    }

    /**
     * 接收 Login 组件实现的 Service 实例
     *
     * @param accountService
     */
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }
}
