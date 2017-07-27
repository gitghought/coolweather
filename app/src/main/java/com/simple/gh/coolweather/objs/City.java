package com.simple.gh.coolweather.objs;

/**
 * Created by gh on 2017-07-27.
 */

public class City {
    private int id;
    private String cityName;
    private int cityID;
    private int proinceID;

    public int getCityID() {
        return cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public int getId() {
        return id;
    }

    public int getProinceID() {
        return proinceID;
    }

    public void setCityID(int cityID) {

        this.cityID = cityID;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProinceID(int proinceID) {
        this.proinceID = proinceID;
    }
}
