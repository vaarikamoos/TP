package com.yogi.tp;

import com.activeandroid.ActiveAndroid;

import android.app.Application;

/**
 * Created by yogi on 10.02.2016.
 * We require an Application class that does initialization of Active Android functionality.
 * So lets make an Application class if we don’t have one or add this code inside the
 * onCreate() of our existing Application class.
 */
public class TP extends Application {

    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        //Notice this initialization code here
        ActiveAndroid.initialize(this);
    }
}
