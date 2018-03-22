package com.fc.androidplus.data;

import com.fc.androidplus.bean.BannerJsonBean;
import com.fc.androidplus.bean.NewsJsonBean;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.data
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/22 0022  13:34
 * @Copyright: 2018  Inc. All rights reserved.
 */
public interface WanandroidApi {

    @GET("article/list/{page}/json")
    Observable<NewsJsonBean> getArticleList(@Path("page") int page);

    @GET("banner/json")
    Observable<BannerJsonBean> getBanner();
}
