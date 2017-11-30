package com.swpuiot.yikao.adapter.Resource;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class ResourceRecyclerViewAdapter extends RecyclerView.Adapter<ResourceRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;

    public ResourceRecyclerViewAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(context);

    }
    @Override
    public ResourceRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ResourceRecyclerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
