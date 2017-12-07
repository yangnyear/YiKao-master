package com.swpuiot.yikao.presenter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.swpuiot.yikao.adapter.Resource.ResourceRecyclerViewAdapter;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;
import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.entities.ResourceEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class ResourcePresenter implements ResourceHolder.presenter, MyItemClickListener, MyItemLongClickListener {
    private ResourceHolder.view mView;
    private Context mContext;
    private  List<ResourceEntity> resourceEntities;
    private   ResourceRecyclerViewAdapter adapter;
    public ResourcePresenter(ResourceHolder.view view, Context context) {
        mView = view;
        mContext = context;
    }
    @Override
    public void initResourceRecycleView(RecyclerView.LayoutManager layoutManager) {
           resourceEntities=MyEntityList.getResouseListy();
            Log.d("yikao", "initResourceRecycleView:resourceEntities.size=" + resourceEntities.size());
            adapter = new ResourceRecyclerViewAdapter(mContext, resourceEntities);
            mView.initResourceRecycleView(layoutManager, adapter);
            Log.d("yikao", "initResourceRecycleView: ");
            adapter.setClickListener(this);
            adapter.setLongClickListener(this);

    }

    @Override
    public void onItemClick(List dataList, int position) {

    }

    @Override
    public void onItemLongClick(List dataList, int position) {

    }
}
