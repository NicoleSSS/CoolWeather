package com.mumu.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @ClassName: Weather
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 18:22
 * @Version: 1.0
 */
public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
