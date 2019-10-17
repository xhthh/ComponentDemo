package com.xht.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xht.basecomponent.service.ShareExportService;

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


    @Autowired
    public ShareExportService mShareExportService;

    /**
     * 测试组件间通信，使用ARouter调用分享组件中暴露的方法
     *
     * @param view
     */
    public void shareTest(View view) {
        ARouter.getInstance().inject(this);

        String hello = mShareExportService.sayHello("微博");

        Toast.makeText(this, hello, Toast.LENGTH_SHORT).show();
    }
}
