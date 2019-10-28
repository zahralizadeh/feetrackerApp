package com.zahra.feetrackerapp.utils;

import com.zahra.feetrackerapp.login.LoginPojoModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface WebInterface {

    @FormUrlEncoded
    @POST("webservice/login")
    Call<LoginPojoModel> login(
            @Field("username") String username,
            @Field("password") String password
    );

}
