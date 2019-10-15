package com.xht.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Created by xht on 2019/10/15.
 */
public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        TextView tvName = view.findViewById(R.id.tv_user_name);
        tvName.setText(AccountUtils.userInfo == null ? "用户未登录" : "登录用户：" + AccountUtils.userInfo.getUserName());
        return view;
    }
}
