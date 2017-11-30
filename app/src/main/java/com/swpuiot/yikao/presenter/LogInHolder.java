package com.swpuiot.yikao.presenter;

/**
 * Created by 羊荣毅_L on 2017/4/23.
 */
public interface LogInHolder {
    interface view {

    }

    interface presenter {
        void logIn(String name,String passwd);
    }
}
