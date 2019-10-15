package com.xht.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/account/login")
public class LoginActivity extends AppCompatActivity {

    private TextView tvState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
        updateLoginState();
    }


    private void initView() {
        tvState = findViewById(R.id.tv_login_state);
    }

    public void login(View view) {
        AccountUtils.userInfo = new UserInfo("10086", "Admin");
        updateLoginState();
    }

    private void updateLoginState() {
        tvState.setText("这里是登录界面：" + (AccountUtils.userInfo == null ? "未登录" : AccountUtils.userInfo.getUserName()));
    }

    public void exit(View view) {
        AccountUtils.userInfo = null;
        updateLoginState();
    }

    public void loginShare(View view) {
        ARouter.getInstance().build("/share/share").withString("share_content", "分享到微信").navigation();
    }
}
