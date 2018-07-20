package com.jeong_woochang.sunrinthon.Retrofit;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by jeong-woochang on 2018. 7. 20..
 */

public interface API {

    @GET("/place")
    Call<ArrayList<LocationRepo>> getPlace();

    @POST("/auth/signin")
    @FormUrlEncoded
    Call<ResponseBody> logIn(@Field("id") String id, @Field("pw") String pw);

    @POST("/auth/signup")
    @FormUrlEncoded
    Call<ResponseBody> logUp(@Field("name") String name, @Field("id") String id, @Field("pw") String pw);

    @GET("/sns")
    Call<ArrayList<snsRepo>> getsnsList();

    @POST("/sns")
    @FormUrlEncoded
    Call<ResponseBody> writesns(@Field("writer") String writer, @Field("content") String content);

    @GET("/sns/{id}")
    Call<ResponseBody> getsnsDetail(@Path("id") String id);

    @POST("/sns/{id}")
    @FormUrlEncoded
    Call<ResponseBody> writeAnswer(@Path("id") String id, @Field("writer") String writer, @Field("content") String content);
}
