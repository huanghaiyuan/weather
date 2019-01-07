package com.hhy.library.ui;

import android.app.Application;

import com.lzy.okgo.OkGo;

/**
 * Created by huanghaiyuan on 2019/1/7.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
    }
}
