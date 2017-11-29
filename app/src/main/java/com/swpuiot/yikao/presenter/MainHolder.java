package com.swpuiot.yikao.presenter;

/**
 * Created by 羊荣毅_L on 2017/3/28.
 */
public interface MainHolder {
    interface view {
        void showHomePageFragment();

        void showPersonalFragment();

        void showHResourceFragment();

        void showSomeBodyFragment();

        void startAnimator();

        void animatorResume();
    }

    interface presenter {
        void showHomePageFragment();

        void showPersonalFragment();

        void showHResourceFragment();

        void showSomeBodyFragment();

        void startAnimator();

        void animatorResume();
    }
}
