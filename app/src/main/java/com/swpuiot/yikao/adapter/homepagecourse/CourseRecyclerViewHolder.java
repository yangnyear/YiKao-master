package com.swpuiot.yikao.adapter.homepagecourse;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/4/1.
 * HomepageScourseRecyclerViewHolder
 */
class CourseRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener{
    public ImageView courseImageContent;
    public TextView courseName;
    public MyItemClickListener mClickListener;
    public MyItemLongClickListener mLongClickListener;

    public CourseRecyclerViewHolder(View itemView, MyItemClickListener clickListener, MyItemLongClickListener longClickListener) {
        super(itemView);
        courseImageContent= (ImageView) itemView.findViewById(R.id.image_homepage_course);
        courseName= (TextView) itemView.findViewById(R.id.tt_course_name);
        mClickListener = clickListener;
        mLongClickListener = longClickListener;
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (itemView!=null){
            mClickListener.onItemClick(v, getPosition());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (itemView!=null){
            mLongClickListener.onItemLongClick(v,getPosition());
        }
        return true;
    }
}
