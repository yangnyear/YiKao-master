package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.data.BannerLoader;
import com.swpuiot.yikao.presenter.HomePageHolder;
import com.swpuiot.yikao.presenter.HomePagePresenter;
import com.youth.banner.Banner;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/28.
 * 首页
 */
public class HomePageFragment extends Fragment implements HomePageHolder.view {
    private View mView;
    private RecyclerView mCourseRecyclerView;
    private RecyclerView mNewsRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private GridLayoutManager mGridLayoutManager;
    private Banner banner;
    private HomePageHolder.presenter mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_homepage, container, false);
        }
        inite();
        mPresenter.setBunner(true);
        mPresenter.setCourseRecyclerView(mGridLayoutManager);
        mPresenter.setNewsRecyclerView(mLinearLayoutManager);
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }


    public void inite() {
        mCourseRecyclerView = (RecyclerView) mView.findViewById(R.id.rcl_homepage_course);
        mNewsRecyclerView = (RecyclerView) mView.findViewById(R.id.rcl_homepage_news);

        mLinearLayoutManager = new LinearLayoutManager(getContext());
        mGridLayoutManager = new GridLayoutManager(getContext(), 4);

        mPresenter = new HomePagePresenter(getContext(), this);

        banner = (Banner) mView.findViewById(R.id.banner);

    }

    @Override
    public void setBunner(BannerLoader bannerLoader, List<?> list, Boolean isAutoPlay) {
        //图片轮播
        if (banner != null)
            banner.setImageLoader(bannerLoader)
                    .setImages(list)
                    .isAutoPlay(isAutoPlay)
                    .start();
    }

    @Override
    public void setCourseRecyclerView(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter) {
        mCourseRecyclerView.setLayoutManager(layoutManager);
        mCourseRecyclerView.setAdapter(adapter);
    }

    @Override
    public void setNewsRecyclerView(RecyclerView.LayoutManager layoutManager, RecyclerView.Adapter adapter) {
        mNewsRecyclerView.setLayoutManager(layoutManager);
        mNewsRecyclerView.setAdapter(adapter);
    }
}
