package com.swpuiot.yikao.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.swpuiot.yikao.adapter.homepagecourse.CourseRecyclerViewAdapter;
import com.swpuiot.yikao.adapter.homepagenews.NewsRecyclerViewAdapter;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;
import com.swpuiot.yikao.data.BannerLoader;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.entities.NewsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class HomePagePresenter implements HomePageHolder.presenter,MyItemClickListener,MyItemLongClickListener{
    private MyEntityList mEntityList;
    private HomePageHolder.view mView;
    private Context mContext;
    private BannerLoader bannerLoader;
    private CourseRecyclerViewAdapter courseAdapter;
    private NewsRecyclerViewAdapter newsAdapter;// TODO: 2017/4/3
    private List<Integer> listOfImageId;
    private List<NewsEntity> mNewsEntityList;


    public HomePagePresenter(Context context, HomePageHolder.view view) {
        mContext = context;
        mView = view;
        mEntityList = MyEntityList.getMyEntityList();
        bannerLoader = BannerLoader.getBannerLoader();
        listOfImageId=new ArrayList<>();
        mNewsEntityList=new ArrayList<>();
        mEntityList.getNewsList(mNewsEntityList);
        courseAdapter=new CourseRecyclerViewAdapter(mContext, mEntityList.getCousdeList());
        newsAdapter=new NewsRecyclerViewAdapter(mContext,mNewsEntityList);
        courseAdapter.setLongClickListener(this);
        courseAdapter.setClickListener(this);
        newsAdapter.setClickListener(this);
        newsAdapter.setLongClickListener(this);

    }


    @Override
    public void setBunner(Boolean isAutoPlay) {
        mEntityList.loadImageList(listOfImageId);
        if (listOfImageId != null) {
            mView.setBunner(bannerLoader, listOfImageId, isAutoPlay);
        }
    }

    @Override
     public void setCourseRecyclerView(RecyclerView.LayoutManager layoutManager) {
        mView.setCourseRecyclerView(layoutManager, courseAdapter);
    }

    @Override
    public void setNewsRecyclerView(RecyclerView.LayoutManager layoutManager) {
        mView.setNewsRecyclerView(layoutManager, newsAdapter);
    }

    @Override
    public void onItemClick(List dataList, int position) {

    }

    @Override
    public void onItemLongClick(List dataList, int position) {

    }
}
