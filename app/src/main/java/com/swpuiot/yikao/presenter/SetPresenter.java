package com.swpuiot.yikao.presenter;

import android.content.Context;

/**
 * Created by 羊荣毅_L on 2017/4/23.
 */
public class SetPresenter implements SetHolder.presenter {
    private Context mContext;
    private SetHolder.view mView;

    public SetPresenter(Context context, SetHolder.view view) {
        mContext = context;
        mView = view;
    }
}
