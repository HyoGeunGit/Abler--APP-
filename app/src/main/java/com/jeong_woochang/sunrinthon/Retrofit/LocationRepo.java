package com.jeong_woochang.sunrinthon.Retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

public class LocationRepo {
    @SerializedName("lat")
    String lat = "";

    @SerializedName("lng")
    String lng = "";

    @SerializedName("placeName")
    String placeName = "";
}
