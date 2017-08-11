package com.example.jock.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Jock on 2017/8/10.
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
