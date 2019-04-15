package com.mumu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: Forecast
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:20
 * @Version: 1.0
 */
public class Forecast {


    public String date;
    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

}
