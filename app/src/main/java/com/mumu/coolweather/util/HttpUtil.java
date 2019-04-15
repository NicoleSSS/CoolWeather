package com.mumu.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @ClassName: HttpUtil
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 16:24
 * @Version: 1.0
 */
public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
