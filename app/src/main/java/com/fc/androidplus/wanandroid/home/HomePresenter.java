package com.fc.androidplus.wanandroid.home;

import com.fc.androidplus.bean.BannerJsonBean;
import com.fc.androidplus.bean.NewsJsonBean;
import com.fc.androidplus.data.HttpUtils;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.wanandroid.home
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/22 0022  13:27
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class HomePresenter implements HomeContract.Presenter {
    HomeContract.View view;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void getArticleList(int page) {
        view.showProgressDialog();
        HttpUtils.getInstance().getArticleList(page, new Observer<NewsJsonBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(NewsJsonBean newsJsonBean) {
                view.flushNews(newsJsonBean);
            }

            @Override
            public void onError(Throwable e) {
                view.dismissProgressDialog();
                view.showErrinfo(e.getMessage());

            }

            @Override
            public void onComplete() {
                view.dismissProgressDialog();
            }
        });
    }

    @Override
    public void getBanner() {
        HttpUtils.getInstance().getBanner(new Observer<BannerJsonBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(BannerJsonBean bannerJsonBean) {
                List<BannerJsonBean.DataBean> data = bannerJsonBean.getData();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
