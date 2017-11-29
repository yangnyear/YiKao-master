package com.swpuiot.yikao.presenter;

import android.content.Context;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class SomeBodyPresenter implements SomeBodyHolder.presenter{
    private Context mContext;
    private SomeBodyHolder.view mView;

    public SomeBodyPresenter(Context context) {
        mContext = context;
        mView= (SomeBodyHolder.view) context;
    }
}
