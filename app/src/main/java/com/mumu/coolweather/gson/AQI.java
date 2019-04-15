package com.mumu.coolweather.gson;

/**
 * @ClassName: AQI
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:14
 * @Version: 1.0
 */
public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
