package com.xht.component;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xht.basecomponent.ServiceFactory;

/**
 * Created by xht on 2019/10/15.
 */
public class TestFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ServiceFactory.getInstance().getAccountService().newUserFragment(this, R.id.layout_fragment,
                getSupportFragmentManager(), null, "");
    }
}
