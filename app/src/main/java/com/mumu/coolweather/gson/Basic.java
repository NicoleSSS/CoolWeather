package com.mumu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: Basic
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:13
 * @Version: 1.0
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
