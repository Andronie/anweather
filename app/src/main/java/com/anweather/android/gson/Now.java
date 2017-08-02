package com.anweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by An on 2017/8/1.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("vis")
    public String vis;

    @SerializedName("pcpn")
    public String pcpn;

    @SerializedName("hum")
    public String hum;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("wind")
    public Wind wind;

    public class Wind{
        @SerializedName("dir")
        public String dir;

        @SerializedName("sc")
        public String sc;

        @SerializedName("spd")
        public String speed;
    }
}
