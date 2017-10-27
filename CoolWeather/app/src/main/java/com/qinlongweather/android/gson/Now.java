package com.qinlongweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 秦龙 on 2017/8/25.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
