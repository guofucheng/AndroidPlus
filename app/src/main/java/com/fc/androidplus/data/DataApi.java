package com.fc.androidplus.data;

import com.fc.androidplus.bean.WordsResultBean;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.jlj.myapplication.data
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/21 0021  9:11
 * @Copyright: 2018  Inc. All rights reserved.
 */
public interface DataApi {
    @POST("suggest?le=eng&doctype=json")
    @FormUrlEncoded
    Observable<WordsResultBean> findWord(@Field("q") String q);
}
