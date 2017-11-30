package com.swpuiot.yikao.presenter;

import android.content.Context;

import com.swpuiot.yikao.data.NetWork;

/**
 * Created by 羊荣毅_L on 2017/4/23.
 */
public class LogInPresenter implements LogInHolder.presenter {
    private Context mContext;
    private LogInHolder.view mView;
    public LogInPresenter(Context context,LogInHolder.view view){
        mContext=context;
        mView=view;
    }

    @Override
    public void logIn(String name, String passwd) {
        NetWork.logIn(name,passwd);
    }
}
