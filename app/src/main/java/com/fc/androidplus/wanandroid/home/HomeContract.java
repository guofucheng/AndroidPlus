package com.fc.androidplus.wanandroid.home;

import com.fc.androidplus.base.BasePresenter;
import com.fc.androidplus.base.BaseView;
import com.fc.androidplus.bean.BannerJsonBean;
import com.fc.androidplus.bean.NewsJsonBean;

import java.util.List;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.wanandroid.home
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/22 0022  13:28
 * @Copyright: 2018  Inc. All rights reserved.
 */
public interface HomeContract {

    interface View extends BaseView<Presenter>{
        void setBanner(List<BannerJsonBean.DataBean> dataBeans);
        void showErrinfo(String err);
        void flushNews(NewsJsonBean data);
        void showProgressDialog();
        void dismissProgressDialog();
    }

    interface Presenter extends BasePresenter{
        /**
         * 首页文章列表
         * @param page 页码
         */
        void getArticleList(int page);


        void getBanner();
    }


}
