package com.lairui.radarplanet;

import android.content.Context;

import com.wanou.framelibrary.GlobalApplication;

/**
 * Author by wodx521
 * Date on 2018/12/4.
 */
public class MyApplication extends GlobalApplication {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected Context getAppContext() {
        return getApplicationContext();
    }
}
