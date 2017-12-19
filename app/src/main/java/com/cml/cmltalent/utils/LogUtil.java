package com.cml.cmltalent.utils;

import android.util.Log;

import com.cml.cmltalent.BuildConfig;

/**
 * Created by chenmingliang on 2017/12/19.
 */

public class LogUtil {

    public static final String TAG = "CML";

    public static void loge(String msg){
        if(BuildConfig.BUILD_TYPE.equals("debug"))
            Log.e(TAG,msg);
    }
}
