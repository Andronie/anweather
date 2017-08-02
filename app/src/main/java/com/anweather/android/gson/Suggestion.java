package com.anweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by An on 2017/8/1.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash caeWash;

    @SerializedName("uv")
    public Uv uv;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

    public class Uv{
        @SerializedName("txt")
        public String uv;

        @SerializedName("brf")
        public String brf;
    }

}
