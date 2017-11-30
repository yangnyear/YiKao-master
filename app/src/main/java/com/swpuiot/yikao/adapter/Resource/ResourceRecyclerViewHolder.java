package com.swpuiot.yikao.adapter.Resource;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class ResourceRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
    public TextView sbName;
    public TextView sbDateAndTime;
    public TextView sbIntroduce;
    public TextView sbGradePoint;
    public TextView sbPhoneNumb;
    public TextView sbGoodAtCourse;
    public TextView checkNumb;
    public TextView criticiseNumb;
    public TextView zanNumb;
    public MyItemClickListener mClickListener;
    public MyItemLongClickListener mLongClickListener;

    public ResourceRecyclerViewHolder(View itemView, MyItemClickListener clickListener, MyItemLongClickListener longClickListener) {
        super(itemView);
        sbName = (TextView) itemView.findViewById(R.id.tt_nameofds);
        sbDateAndTime = (TextView) itemView.findViewById(R.id.tt_date_Time);
        sbIntroduce = (TextView) itemView.findViewById(R.id.tt_date_introduce);
        sbGradePoint = (TextView) itemView.findViewById(R.id.tt_qqnumb);
        sbPhoneNumb = (TextView) itemView.findViewById(R.id.tt_phonenumb);
        sbGoodAtCourse = (TextView) itemView.findViewById(R.id.tt_goodat_course);
        checkNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_check);
        criticiseNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_criticise);
        zanNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_zan);
        this.mLongClickListener = longClickListener;
        this.mClickListener = clickListener;
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (itemView != null) {
            mClickListener.onItemClick(v, getPosition());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (itemView != null) {
            mLongClickListener.onItemLongClick(v, getPosition());
        }
        return true;
    }
}
