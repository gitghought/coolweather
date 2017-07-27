package com.simple.gh.coolweather.objs;

import org.litepal.crud.DataSupport;

/**
 * Created by gh on 2017-07-27.
 */

public class Countries extends DataSupport{
    private int id;
    private String countryName;
    private int countryID;
    private int weatherID;
    private int cityID;

    public int getCityID() {
        return cityID;
    }

    public int getCountryID() {
        return countryID;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getId() {
        return id;
    }

    public int getWeatherID() {
        return weatherID;
    }

    public void setCityID(int cityID) {

        this.cityID = cityID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherID(int weatherID) {
        this.weatherID = weatherID;
    }
}
