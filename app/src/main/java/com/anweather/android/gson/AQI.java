package com.anweather.android.gson;

/**
 * Created by An on 2017/8/1.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
