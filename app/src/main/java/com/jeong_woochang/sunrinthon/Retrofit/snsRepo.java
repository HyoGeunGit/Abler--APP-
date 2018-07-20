package com.jeong_woochang.sunrinthon.Retrofit;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

public class snsRepo {
    @SerializedName("id")
    String id;
    @SerializedName("writer")
    String writer;
    @SerializedName("content")
    String content;
    @SerializedName("date")
    String date;
}