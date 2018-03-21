package com.fc.androidplus.words;

import com.fc.androidplus.base.BasePresenter;
import com.fc.androidplus.base.BaseView;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.words
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/21 0021  10:05
 * @Copyright: 2018  Inc. All rights reserved.
 */
public interface WordsContract {
    interface View extends BaseView<Presenter> {

        void showProgressDialog();

        void dismissProgressDialog();

        void showResult(String result);

        void errPromopt(String err);

    }

    interface Presenter extends BasePresenter {
        void searchWord(String word);
        void shiyi(String word);

    }


}
