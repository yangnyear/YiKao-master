package com.swpuiot.yikao.adapter.somebodyneeds;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class SomeBodyNeedsHolder extends RecyclerView.ViewHolder {
    public TextView time;
    public SimpleDraweeView logo;
    public TextView needsInfor;
    public TextView course;
    public TextView phoneNumb;
    public TextView academcal;
    public TextView checkNumb;
    public TextView messageNumb;
    public TextView zanNumb;

    public SomeBodyNeedsHolder(View itemView) {
        super(itemView);
        time = (TextView) itemView.findViewById(R.id.tt_needs_somebody_time);
        logo = (SimpleDraweeView) itemView.findViewById(R.id.image_needs_somebody_logo);
        needsInfor = (TextView) itemView.findViewById(R.id.tt_needs_somebody_infor);
        course = (TextView) itemView.findViewById(R.id.tt_needs_somebody_course);
        phoneNumb = (TextView) itemView.findViewById(R.id.tt_needs_somebody_phone);
        academcal= (TextView) itemView.findViewById(R.id.tt_needs_somebody_accademycal);
        checkNumb= (TextView) itemView.findViewById(R.id.tt_needs_somebody_checknumb);
        messageNumb= (TextView) itemView.findViewById(R.id.tt_needs_somebody_messagenumb);
        zanNumb= (TextView) itemView.findViewById(R.id.tt_needs_somebody_zannumb);
    }
}
