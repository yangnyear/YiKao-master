package com.swpuiot.yikao.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.adapter.SomeBody.SomeBodyRecyclerViewAdapter;
import com.swpuiot.yikao.adapter.somebodyneeds.SomoBodyNeedsAdapter;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.data.NetWork;
import com.swpuiot.yikao.entities.NeedSomeBodyEntity;
import com.swpuiot.yikao.entities.SomeBodyEntity;
import com.swpuiot.yikao.presenter.SomeBodyHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 悬赏
 */
public class SomeBodyFragment extends Fragment implements SomeBodyHolder.view {
    private View mView;
    private MyEntityList mEntityList;
    private RecyclerView needsHelp;
    private RecyclerView somebody;
    private StaggeredGridLayoutManager needsLayoutManager;
    private LinearLayoutManager somebodyLayoutManager;
    private NetWork mNetWork;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_somebody, container, false);
        }
        inite();
        needsLayoutManager = new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL);
        needsHelp.setLayoutManager(needsLayoutManager);
        setNeedsAdapter();
        somebodyLayoutManager = new LinearLayoutManager(getContext());
        somebody.setLayoutManager(somebodyLayoutManager);
        setSomebodyAdapter();
        return mView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    private void inite() {
        mEntityList = MyEntityList.getMyEntityList();
        needsHelp = (RecyclerView) mView.findViewById(R.id.rcl_somebody_needlist);
        somebody = (RecyclerView) mView.findViewById(R.id.rcl_somebody_dashenlist);
    }

    private void setNeedsAdapter() {
        List<NeedSomeBodyEntity> needSomeBodyEntities = new ArrayList<>();
//        mEntityList.getNeedsList(needSomeBodyEntities);
        SomoBodyNeedsAdapter adapter = new SomoBodyNeedsAdapter(getContext(), needSomeBodyEntities);
//        needsHelp.setAdapter(adapter);
    }

    private void setSomebodyAdapter() {
        List<SomeBodyEntity> someBodyEntities=new ArrayList<>();
        mNetWork=new NetWork(someBodyEntities);
        someBodyEntities= (List<SomeBodyEntity>) mNetWork.getSomeBodyList();
        SomeBodyRecyclerViewAdapter adapter=new SomeBodyRecyclerViewAdapter(getContext(),someBodyEntities);
        somebody.setAdapter(adapter);
    }
}
