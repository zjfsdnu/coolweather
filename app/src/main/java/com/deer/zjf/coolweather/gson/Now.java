package com.deer.zjf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zjf on 2017/2/27.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
