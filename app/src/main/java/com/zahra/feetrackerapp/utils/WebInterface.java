package com.zahra.feetrackerapp.utils;

import com.zahra.feetrackerapp.Register.RegisterPojoModel;
import com.zahra.feetrackerapp.login.LoginPojoModel;
import com.zahra.feetrackerapp.queryprice.QueryPricePojoModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface WebInterface {

    @FormUrlEncoded
    @POST("webservice/login")
    Call<LoginPojoModel> login(
            @Field("username") String username,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("webservice/register")
    Call<RegisterPojoModel> register(
            @Field("username") String username,
            @Field("password") String password,
            @Field("email") String email
    );

    @GET("query/price")
    Call<QueryPricePojoModel> queryPrice(
            @Query("location") String location,
            @Query("area") String area,
            @Query("age") String age,
            @Query("rooms") String rooms,
            @Query("offertype") String offertype,
            @Query("propertytype") String propertytype
    );


}
