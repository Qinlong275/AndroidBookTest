package com.qinlongweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 秦龙 on 2017/8/25.
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
