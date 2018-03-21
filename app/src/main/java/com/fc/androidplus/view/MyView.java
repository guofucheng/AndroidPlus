package com.fc.androidplus.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * All rights Reserved
 *
 * @version V1.0
 * @Package com.fc.androidplus.view
 * @Description: ${TODO}
 * @author: GFC
 * @date: 2018/3/21 0021  14:44
 * @Copyright: 2018  Inc. All rights reserved.
 */
public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
