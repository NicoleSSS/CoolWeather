package com.mumu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @ClassName: Suggestion
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:17
 * @Version: 1.0
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
