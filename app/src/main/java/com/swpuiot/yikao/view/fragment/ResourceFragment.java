package com.swpuiot.yikao.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.adapter.Resource.ResourceRecyclerViewAdapter;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.presenter.ResourceHolder;
import com.swpuiot.yikao.presenter.ResourcePresenter;


/**
 * Created by 羊荣毅_L on 2017/3/29.
 * 资料
 */

public class ResourceFragment extends Fragment implements ResourceHolder.view {
    private RecyclerView resourceList;
    private View mView;
    private ResourceHolder.presenter presenter;
    private LinearLayoutManager layoutManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fragment_resource, container, false);
        }
        inite();
        return mView;
    }

    private void inite() {
        resourceList= (RecyclerView) mView.findViewById(R.id.rcl_resource_list);
        presenter=new ResourcePresenter(this,this.getContext());
        layoutManager=new LinearLayoutManager(this.getContext());
        presenter.initResourceRecycleView(layoutManager);
    }

    @Override
    public void initResourceRecycleView(RecyclerView.LayoutManager layoutManager, ResourceRecyclerViewAdapter adapter) {
        resourceList.setLayoutManager(layoutManager);
        resourceList.setAdapter(adapter);
    }
}
