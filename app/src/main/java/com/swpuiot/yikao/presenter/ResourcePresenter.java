package com.swpuiot.yikao.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.entities.ResourceEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class ResourcePresenter implements ResourceHolder.presenter {
    private ResourceHolder.view mView;
    private Context mContext;
    private List<ResourceEntity> resourceEntities;
    private ArrayAdapter<String> Adapter;


    public ResourcePresenter(ResourceHolder.view view, Context context) {
        mView = view;
        mContext = context;
    }

    @Override
    public void initResourceRecycleView(RecyclerView.LayoutManager layoutManager) {

    }
}
