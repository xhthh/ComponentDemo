package com.xht.share;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xht.basecomponent.ServiceFactory;

@Route(path = "/share/share")
public class ShareActivity extends AppCompatActivity {

    @Autowired(name = "object")
    User user;

    @Autowired(name = "share_content")
    String content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        ARouter.getInstance().inject(this);


        if (!TextUtils.isEmpty(content)) {
            ((TextView) findViewById(R.id.share_content)).setText(content);
        }


        Log.i("xht", "ShareActivity---user.name==" + user.name);

        share();
    }

    private void share() {
        if (ServiceFactory.getInstance().getAccountService().isLogin()) {
            Toast.makeText(this, "分享成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "分享失败：用户未登录", Toast.LENGTH_SHORT).show();
        }
    }

    public void shareLogin(View view) {
        ARouter.getInstance().build("/account/login").navigation();
    }
}
