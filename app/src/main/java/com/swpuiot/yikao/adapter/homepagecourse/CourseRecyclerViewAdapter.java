package com.swpuiot.yikao.adapter.homepagecourse;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
public class CourseRecyclerViewAdapter extends RecyclerView.Adapter<CourseRecyclerViewAdapter.CourseRecyclerViewHolder> {
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
                mClickListener.onItemClick(mCourseEntities, getPosition());
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (itemView!=null){
                mLongClickListener.onItemLongClick(mCourseEntities,getPosition());
            }
            return true;
        }
    }
}
