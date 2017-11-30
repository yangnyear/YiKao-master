package com.swpuiot.yikao.adapter.homepagecourse;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;
import com.swpuiot.yikao.entities.CourseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/1.
 * HomePageRecyclerViewAdapter
 */
public class CourseRecyclerViewAdapter extends RecyclerView.Adapter<CourseRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<CourseEntity> mCourseEntities=new ArrayList<>();

    public CourseRecyclerViewAdapter(Context context, List<CourseEntity> courseEntities) {
        mContext = context;
        mInflater=LayoutInflater.from(context);
        mCourseEntities = courseEntities;
    }

    @Override
    public CourseRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= mInflater.inflate(R.layout.item_homepage_course,parent,false);
        CourseRecyclerViewHolder viewHolder=new CourseRecyclerViewHolder(itemView,mClickListener,mLongClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CourseRecyclerViewHolder holder, int position) {
        holder.courseImageContent.setImageResource(mCourseEntities.get(position).getCourseImageId());
        holder.courseName.setText(mCourseEntities.get(position).getCourseName());
    }

    @Override
    public int getItemCount() {
        return mCourseEntities.size();
    }
    //暴露给Recycleview设置点击事件
    public void setClickListener(MyItemClickListener clickListener) {
        mClickListener = clickListener;
    }

    //暴露给Recycleview设置长按点击事件
    public void setLongClickListener(MyItemLongClickListener longClickListener) {
        mLongClickListener = longClickListener;
    }
}
