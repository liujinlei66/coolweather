package com.coolweather.android.util;

import java.util.HashMap;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    //单例模式->饿汉式
    private static HttpUtil instance = new HttpUtil();
    private HttpUtil() {};
    public static HttpUtil getInstance(){
        return instance;
    }

    /* ------------------Public Utilities-------------------- */

    /**
     * 服务器请求
     * @param address
     * @param callback
     */
    public void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
