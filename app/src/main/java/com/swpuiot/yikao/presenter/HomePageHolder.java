package com.swpuiot.yikao.presenter;

import android.support.v7.widget.RecyclerView;

import com.swpuiot.yikao.data.BannerLoader;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public interface HomePageHolder {
    interface presenter {

        void setBunner(Boolean isAutoPlay);

        void setCourseRecyclerView(RecyclerView.LayoutManager layoutManager);

        void setNewsRecyclerView(RecyclerView.LayoutManager layoutManager);

    }

    interface view {
        void setBunner(BannerLoader bannerLoader, List<?> list, Boolean isAutoPlay);

        void setCourseRecyclerView(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter);

        void setNewsRecyclerView(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter);
    }
}

