package com.mumu.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @ClassName: County
 * @Description: 描述
 * @Author: 范琳琳
 * @CreateDate: 2019/4/12 16:16
 * @Version: 1.0
 */
public class County extends LitePalSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
