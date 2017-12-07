package com.swpuiot.yikao.clicklistener;

import android.view.View;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/12.
 * Recycleview 点击事件
 */
public interface MyItemClickListener {
    public void onItemClick(List dataList, int position,int type);
}
