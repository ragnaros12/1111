package com.example.wsr44;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @POST("api/user/login")
    public Call<LoginResp> login(@Body LoginForm loginForm);

    @GET("/api/quotes")
    public Call<quotes> quotes();
}
