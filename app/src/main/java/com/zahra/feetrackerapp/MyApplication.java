package com.zahra.feetrackerapp;

import android.app.Application;
import android.graphics.Typeface;

import com.orhanobut.hawk.Hawk;

public class MyApplication extends Application {
    public static Typeface appFace_light ;
    public static Typeface appFace_regular ;

    @Override
    public void onCreate() {
        super.onCreate();
        appFace_light = Typeface.createFromAsset(getAssets() , Constants.light_font) ;
        appFace_regular = Typeface.createFromAsset(getAssets() , Constants.regular_font) ;
        Hawk.init(this).build();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
