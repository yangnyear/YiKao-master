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
    private static List<ResourceEntity> resourceEntities;
    private ArrayAdapter<String> Adapter;
    private RecyclerView.LayoutManager layoutManager;

    public ResourcePresenter(ResourceHolder.view view, Context context) {
        mView = view;
        mContext = context;
    }
      public static void bindResoude(List<ResourceEntity> resourceEs) {
          Log.d("yikao", "bindResoude:"+resourceEs.size());
         resourceEntities=resourceEs;
       }
    @Override
    public void initResourceRecycleView(RecyclerView.LayoutManager layoutManager) {

        MyEntityList.getMyEntityList().sendRequestWithHttpURLConnection();

        if (resourceEntities == null) {
            Log.d("yikao", "initResourceRecycleView:resourceEntities.size=null");
        } else {
            Log.d("yikao", "initResourceRecycleView:resourceEntities.size=" + resourceEntities.size());
            ResourceRecyclerViewAdapter adapter = new ResourceRecyclerViewAdapter(mContext, resourceEntities);
            adapter.setClickListener(this);
            adapter.setLongClickListener(this);
            mView.initResourceRecycleView(layoutManager, adapter);
        }
    }

    @Override
    public void onItemClick(List dataList, int position) {

    }

    @Override
    public void onItemLongClick(List dataList, int position) {

    }
}
