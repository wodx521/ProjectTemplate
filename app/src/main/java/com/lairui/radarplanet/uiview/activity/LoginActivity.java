package com.lairui.radarplanet.uiview.activity;

import android.view.View;
import android.widget.TextView;

import com.lairui.radarplanet.R;
import com.lairui.radarplanet.presenter.LoginPresenter;
import com.wanou.framelibrary.base.BaseMvpActivity;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class LoginActivity extends BaseMvpActivity<LoginPresenter> {
    private TextView mTvLogin;

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected int getResId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mTvLogin = findViewById(R.id.tv_login);
        mTvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.startActivity(LoginActivity.this, null, MainActivity.class);
            }
        });
    }

    @Override
    protected void initData() {

    }

}
