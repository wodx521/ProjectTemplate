package com.lairui.radarplanet.uiview.activity;

import android.widget.ImageView;

import com.lairui.radarplanet.R;
import com.wanou.framelibrary.base.BaseActivity;
import com.wanou.framelibrary.glidetools.GlideApp;
import com.wanou.framelibrary.utils.CountDownUtils;

public class SplashActivity extends BaseActivity {

    @Override
    protected int getResId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        ImageView mIvSplash = findViewById(R.id.iv_splash);
        GlideApp.with(this)
                .load("")
                .into(mIvSplash);
        CountDownUtils.getTimer(3, null, "");
        CountDownUtils.setTimeFinishListener(new CountDownUtils.CountTimeFinishListener() {
            @Override
            public void onTimeFinishListener() {
                LoginActivity.startActivity(SplashActivity.this, null, LoginActivity.class);
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        CountDownUtils.cancelTimer();
        CountDownUtils.setTimeFinishListener(null);
    }
}
