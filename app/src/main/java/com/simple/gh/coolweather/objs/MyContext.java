package com.simple.gh.coolweather.objs;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by gh on 2017-07-27.
 */

public class MyContext extends Application{
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        MyContext.context = this.getApplicationContext();
        LitePal.initialize(context);

    }

    public static Context getContext () {
        return MyContext.context;
    }
}
