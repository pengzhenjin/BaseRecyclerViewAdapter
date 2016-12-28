package com.baserecyclerviewadapter.base;

import android.app.Application;
import com.baserecyclerviewadapter.BuildConfig;
import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;

/**
 * BaseApplication
 *
 * @author PengZhenjin
 * @date 2016-12-27
 */
public class BaseApplication extends Application {
    private static BaseApplication appContext;

    public static BaseApplication getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
        if (BuildConfig.DEBUG) {
            Logger.init("BaseRecyclerViewAdapter")                 // default PRETTYLOGGER or use just init()
                  .methodCount(3)                 // default 2
                  .logLevel(LogLevel.FULL)        // default LogLevel.FULL
                  .methodOffset(2)                // default 0
            ; //default AndroidLogAdapter
        }
    }
}
