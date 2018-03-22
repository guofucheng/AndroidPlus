package com.fc.androidplus.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.fc.androidplus.R;
import com.fc.androidplus.bean.NewsJsonBean;

import java.util.List;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.adapter
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/22 0022  13:19
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class NewsAdapter extends BaseQuickAdapter<NewsJsonBean.DataBean.DatasBean,BaseViewHolder>{


    public NewsAdapter(int layoutResId, @Nullable List<NewsJsonBean.DataBean.DatasBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, NewsJsonBean.DataBean.DatasBean item) {
        helper.setText(R.id.tv_title,item.getTitle());
        helper.setText(R.id.tv_author,item.getAuthor());
        helper.setText(R.id.tv_updatetime,item.getNiceDate());
        helper.setText(R.id.tv_chapterName,item.getChapterName());
    }
}
