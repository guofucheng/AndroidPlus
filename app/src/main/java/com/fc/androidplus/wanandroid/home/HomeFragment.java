package com.fc.androidplus.wanandroid.home;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.fc.androidplus.R;
import com.fc.androidplus.adapter.NewsAdapter;
import com.fc.androidplus.bean.BannerJsonBean;
import com.fc.androidplus.bean.NewsJsonBean;
import com.fc.androidplus.utils.GlideImageloader;
import com.tapadoo.alerter.Alerter;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment implements HomeContract.View{
    HomeContract.Presenter mPresenter;
    RecyclerView rv_list;
    NewsAdapter adapter;
    Banner banner;
    public HomeFragment() {

    }


    public static HomeFragment newInstance() {

        return new HomeFragment();
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter=new HomePresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        banner= view.findViewById(R.id.banner);
        banner.setImageLoader(new GlideImageloader());

        rv_list = view.findViewById(R.id.rv_list);
        rv_list.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter=new NewsAdapter(R.layout.artical_items,null);
        adapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);
        adapter.isFirstOnly(false);
        rv_list.setAdapter(adapter);
        progressDialog=new ProgressDialog(getActivity());
        progressDialog.setTitle("提示");
        progressDialog.setMessage("正在加载..");
        progressDialog.setCanceledOnTouchOutside(false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.getBanner();
        mPresenter.getArticleList(0);
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        mPresenter=presenter;
    }

    @Override
    public void setBanner(List<BannerJsonBean.DataBean> dataBeans) {
        List<String> url=new ArrayList<>();
        url.add("http://img4.imgtn.bdimg.com/it/u=1665207864,746409922&fm=27&gp=0.jpg");
        url.add("http://img4.imgtn.bdimg.com/it/u=1665207864,746409922&fm=27&gp=0.jpg");
        url.add("http://pic29.nipic.com/20130514/12477194_083818249176_2.jpg");
        banner.setImages(url).start();
    }

    @Override
    public void showErrinfo(String err) {
        Alerter.create(getActivity()).setTitle("提示").setText(err).setIcon(R.drawable.alerter_ic_notifications).setDuration(2000).show();
    }

    @Override
    public void flushNews(NewsJsonBean data) {
        adapter.setNewData(data.getData().getDatas());
    }

    ProgressDialog progressDialog;
    @Override
    public void showProgressDialog() {
        progressDialog.show();
    }

    @Override
    public void dismissProgressDialog() {
        progressDialog.dismiss();
    }
}
