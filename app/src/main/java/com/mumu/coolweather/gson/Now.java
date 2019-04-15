package com.mumu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: Now
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:15
 * @Version: 1.0
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
