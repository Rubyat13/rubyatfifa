package com.example.rubyatfifa;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface Api {

    String BASE_URL = "https://iotait.tech/participant.json";

    @GET("participant.json")
    Call<List<Hero>> getHeroes();
}