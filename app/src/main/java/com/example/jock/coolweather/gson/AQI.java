package com.example.jock.coolweather.gson;

/**
 * Created by Jock on 2017/8/10.
 */

public class AQI {

    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
