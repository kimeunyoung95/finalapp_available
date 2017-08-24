package com.example.win10_pc.project.application;

import android.app.Application;

import com.example.win10_pc.project.common.Constants;
import com.example.win10_pc.project.network.HttpService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by win10_pc on 2017-06-13.
 */

public class App extends Application {

    private static App instance;
    private Retrofit retrofit;
    private HttpService httpService;

    public static App getInstance() {
        return instance;
    }

    public HttpService getHttpService() {
        return httpService;
    }




    @Override
    public void onCreate() {

        super.onCreate();

        App.instance = this;

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.API_SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        httpService = retrofit.create(HttpService.class);


    }
}