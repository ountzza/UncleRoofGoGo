package com.example.pondd.uncleroofgogo;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Pondd on 12/28/14 AD.
 */
public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // init stuff here
        Contextor.getInstance().init(getApplicationContext());
    }
}