package com.swpuiot.yikao.adapter.homepagenews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;
import com.swpuiot.yikao.entities.NewsEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/2.
 * NewsRecyclerViewAdapter
 */
public class NewsRecyclerViewAdapter extends RecyclerView.Adapter<NewsRecyclerViewAdapter.NewsRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<NewsEntity> newsList;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;

    public NewsRecyclerViewAdapter(Context context, List<NewsEntity> newsList) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        this.newsList = newsList;
    }

    @Override
    public NewsRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = mInflater.inflate(R.layout.item_homepage_news, parent, false);
        NewsRecyclerViewHolder holder = new NewsRecyclerViewHolder(itemview,mClickListener,mLongClickListener);
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

    //暴露给Recycleview设置点击事件
    public void setClickListener(MyItemClickListener clickListener) {
        mClickListener = clickListener;
    }

    //暴露给Recycleview设置长按点击事件
    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        mLongClickListener = longClickListener;
    }
    /**
     * Created by 羊荣毅_L on 2017/4/2.
     */
   class NewsRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
        public TextView newsName;
        public TextView newsparent;
        public TextView newsCheckNumb;
        public TextView NewsmessageNumb;
        public TextView newszanNumb;
        public SimpleDraweeView newsImage;
        public TextView newsTime;
        public MyItemClickListener mClickListener;
        public MyItemLongClickListener mLongClickListener;

        public NewsRecyclerViewHolder(View itemView,MyItemClickListener clickListener,MyItemLongClickListener itemLongClickListener) {
            super(itemView);
            newsName = (TextView) itemView.findViewById(R.id.tt_item_news_name);
            newsparent = (TextView) itemView.findViewById(R.id.tt_news_parent);
            newsCheckNumb = (TextView) itemView.findViewById(R.id.tt_news_checknumb);
            newsCheckNumb = (TextView) itemView.findViewById(R.id.tt_news_checknumb);
            NewsmessageNumb = (TextView) itemView.findViewById(R.id.tt_news_messagenumb);
            newszanNumb = (TextView) itemView.findViewById(R.id.tt_news_zannumb);
            newsImage = (SimpleDraweeView) itemView.findViewById(R.id.image_news_logo);
            newsTime = (TextView) itemView.findViewById(R.id.tt_news_time);
            mClickListener = clickListener;
            mLongClickListener = itemLongClickListener;
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemView!=null){
                mClickListener.onItemClick(newsList, getPosition());
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (itemView != null) {
                mLongClickListener.onItemLongClick(newsList, getPosition());
            }
            return true;
        }
    }
}
