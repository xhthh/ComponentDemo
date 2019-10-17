package com.xht.login;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Created by xht on 2019/10/17.
 */
@Route(path = "/service/json")
public class JavaImplService implements SerializationService {
    Gson mGson;

    @Override
    public void init(Context context) {
        check();
    }

    private void check() {
        if (mGson == null) {
            mGson = new Gson();
        }
    }

    @Override
    public <T> T json2Object(String input, Class<T> clazz) {
        return mGson.fromJson(input, clazz);
    }

    @Override
    public String object2Json(Object instance) {
        return mGson.toJson(instance);
    }

    @Override
    public <T> T parseObject(String input, Type clazz) {
        return mGson.fromJson(input, clazz);
    }
}
