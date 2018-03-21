package com.fc.androidplus.words;

import com.fc.androidplus.bean.WordsResultBean;
import com.fc.androidplus.data.HttpUtils;


import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.words
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/21 0021  10:08
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class WordsPresenter implements WordsContract.Presenter {

    WordsContract.View view;

    public WordsPresenter(WordsContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void searchWord(String word) {
        if (null == word) {
            view.errPromopt("搜索词为null");
            return;
        }
        if ("".equals(word)) {
            view.errPromopt("搜索词为\"\"");
            return;
        }
        view.showProgressDialog();

        HttpUtils.getInstance().findWord(word, new Observer<WordsResultBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(WordsResultBean jsonRootBean) {

                List<WordsResultBean.DataBean.EntriesBean> entries = jsonRootBean.getData().getEntries();
                if (null != entries && entries.size() > 0) {


                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < entries.size(); i++) {
                        sb.append(entries.get(i).getExplain() + "\n");
                    }
                    view.showResult(sb.toString());
                } else {
                    view.showResult("没有该单词");
                }
            }

            @Override
            public void onError(Throwable e) {
                view.showResult(e.getMessage());
            }

            @Override
            public void onComplete() {
                view.dismissProgressDialog();
            }
        });


    }
}
