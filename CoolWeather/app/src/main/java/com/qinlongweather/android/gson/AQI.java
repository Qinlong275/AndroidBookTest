package com.qinlongweather.android.gson;

/**
 * Created by 秦龙 on 2017/8/25.
 */

public class AQI {

    public  AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
