package com.cml.cmltalent.utils;

import android.app.Activity;

/**
 * Created by chenmingliang on 2017/12/19.
 */

public class DeviceUtil {


    public static float getDeviceWidthDpi(Activity activity){
        return activity.getResources().getDisplayMetrics().xdpi;
    }

    public static float getDeviceHeightDpi(Activity activity){
        return activity.getResources().getDisplayMetrics().ydpi;
    }
}
