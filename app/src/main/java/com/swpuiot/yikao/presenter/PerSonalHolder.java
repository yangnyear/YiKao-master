package com.swpuiot.yikao.presenter;

import android.content.Intent;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public interface PerSonalHolder {
    interface view {
        void myStartActivity(Intent intent);
    }

    interface present {
        void startActivity(Intent intent);
    }
}
