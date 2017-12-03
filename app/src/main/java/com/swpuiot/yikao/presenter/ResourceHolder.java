package com.swpuiot.yikao.presenter;

import android.support.v7.widget.RecyclerView;

import com.swpuiot.yikao.adapter.Resource.ResourceRecyclerViewAdapter;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public interface ResourceHolder {
    interface view {
        void initResourceRecycleView(RecyclerView.LayoutManager layoutManager,ResourceRecyclerViewAdapter adapter);
    }

    interface presenter {
        void initResourceRecycleView(RecyclerView.LayoutManager layoutManager);
    }
}
