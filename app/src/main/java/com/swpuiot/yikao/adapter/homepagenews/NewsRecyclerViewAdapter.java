package com.swpuiot.yikao.adapter.homepagenews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.NewsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/2.
 * NewsRecyclerViewAdapter
 */
public class NewsRecyclerViewAdapter extends RecyclerView.Adapter<NewsRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<NewsEntity> newsList;

    public NewsRecyclerViewAdapter(Context context, List<NewsEntity> newsList) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        this.newsList = newsList;
    }

    @Override
    public NewsRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = mInflater.inflate(R.layout.item_homepage_news, parent, false);
        NewsRecyclerViewHolder holder = new NewsRecyclerViewHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(NewsRecyclerViewHolder holder, int position) {
        holder.newsName.setText(newsList.get(position).getNewsName());
        holder.newsparent.setText(newsList.get(position).getCourse());
        holder.newsImage.setImageResource(newsList.get(position).getImageId());
        holder.newsCheckNumb.setText(newsList.get(position).getChecknumb()+"");
        holder.newsTime.setText(newsList.get(position).getNewsTime());
        holder.NewsmessageNumb.setText(newsList.get(position).getMessageNumb()+"");
        holder.newszanNumb.setText(newsList.get(position).getZanNumb()+"");
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
