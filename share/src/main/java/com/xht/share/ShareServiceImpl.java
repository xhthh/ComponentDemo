package com.xht.share;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xht.basecomponent.service.ShareExportService;

/**
 * Created by xht on 2019/10/17.
 */
@Route(path = "/share/shareExportService")
public class ShareServiceImpl implements ShareExportService {
    @Override
    public String sayHello(String str) {
        return "hello 这里是" + str + "分享";
    }

    @Override
    public void init(Context context) {
        Log.i("xht", "ShareServiceImpl------init()");
    }
}
