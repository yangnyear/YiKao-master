package com.swpuiot.yikao.presenter;


import android.content.Context;

/**
 * Created by 羊荣毅_L on 2017/3/28.
 */
public class MainPresenter implements MainHolder.presenter {
    private Context mContext;
    private MainHolder.view mView;

    public MainPresenter(Context context) {
        mContext = context;
        mView = (MainHolder.view) context;
    }

    @Override
    public void showHomePageFragment() {
        mView.showHomePageFragment();
    }

    @Override
    public void showPersonalFragment() {
        mView.showPersonalFragment();
    }

    @Override
    public void showHResourceFragment() {
        mView.showHResourceFragment();
    }

    @Override
    public void showSomeBodyFragment() {
        mView.showSomeBodyFragment();
    }

    @Override
    public void startAnimator() {
        mView.startAnimator();
    }

    @Override
    public void animatorResume() {
        mView.animatorResume();
    }
}
