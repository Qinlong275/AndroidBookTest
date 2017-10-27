package com.qinlongweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 秦龙 on 2017/8/23.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
