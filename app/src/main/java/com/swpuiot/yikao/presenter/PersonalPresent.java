package com.swpuiot.yikao.presenter;

import android.content.Context;
import android.content.Intent;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class PersonalPresent implements PerSonalHolder.present {
    private Context mContext;
    private PerSonalHolder.view mView;

    public PersonalPresent(Context context, PerSonalHolder.view view) {
        mContext = context;
        mView = view;
    }

    @Override
    public void startActivity(Intent intent) {
        mView.myStartActivity(intent);
    }
}
