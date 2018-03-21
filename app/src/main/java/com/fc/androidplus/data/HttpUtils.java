package com.fc.androidplus.data;


import com.fc.androidplus.bean.WordsResultBean;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.jlj.myapplication.mvp
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/20 0020  14:53
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class HttpUtils {
    private DataApi dataApi;
    private static HttpUtils httpUtils;


    private HttpUtils() {

        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS);
        builder.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://dict.youdao.com/")
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        dataApi = retrofit.create(DataApi.class);


    }

    public static HttpUtils getInstance() {
        if (httpUtils == null) {
            synchronized (HttpUtils.class) {
                if (httpUtils == null) {
                    httpUtils = new HttpUtils();

                }


            }


        }
        return httpUtils;
    }



    public void findWord(String word, Observer<WordsResultBean> observer) {
        dataApi.findWord(word)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);

    }
}
