package com.example.inventoryapp.Api;

import com.example.inventoryapp.models.LoginResponse;
import com.example.inventoryapp.models.Response;
import com.example.inventoryapp.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserApi {
    @GET("User")
    Call<List<User>> getUser (@Header("Authorization") String authorization);

    @POST("api/register")
    Call<Response> register (@Body User user);

    @FormUrlEncoded
    @POST("api/login")
    Call<LoginResponse> login (@Field("email")String email, @Field("password")String password);

//    @POST("api/product/:id")
//    Call<>
}
