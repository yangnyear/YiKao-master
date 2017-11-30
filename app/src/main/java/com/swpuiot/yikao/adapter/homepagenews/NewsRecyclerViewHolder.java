package com.swpuiot.yikao.adapter.homepagenews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;

/**
 * Created by 羊荣毅_L on 2017/4/2.
 */
public class NewsRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView newsName;
    public TextView newsparent;
    public TextView newsCheckNumb;
    public TextView NewsmessageNumb;
    public TextView newszanNumb;
    public SimpleDraweeView newsImage;
    public TextView newsTime;

    public NewsRecyclerViewHolder(View itemView) {
        super(itemView);
        newsName = (TextView) itemView.findViewById(R.id.tt_item_news_name);
        newsparent = (TextView) itemView.findViewById(R.id.tt_news_parent);
        newsCheckNumb = (TextView) itemView.findViewById(R.id.tt_news_checknumb);
        newsCheckNumb = (TextView) itemView.findViewById(R.id.tt_news_checknumb);
        NewsmessageNumb = (TextView) itemView.findViewById(R.id.tt_news_messagenumb);
        newszanNumb = (TextView) itemView.findViewById(R.id.tt_news_zannumb);
        newsImage = (SimpleDraweeView) itemView.findViewById(R.id.image_news_logo);
        newsTime = (TextView) itemView.findViewById(R.id.tt_news_time);
    }
}
