package com.swpuiot.yikao.adapter.SomeBody;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyRecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView time;
    public TextView prooduce;
    public TextView jidian;
    public TextView phoneNumb;
    public TextView goodAt;
    public TextView checkNumb;
    public TextView messageNumb;
    public TextView zanNumb;
    public SimpleDraweeView image;

    public SomeBodyRecyclerViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.tt_nameofds);
        time = (TextView) itemView.findViewById(R.id.tt_date_Time);
        prooduce = (TextView) itemView.findViewById(R.id.tt_date_introduce);
        jidian = (TextView) itemView.findViewById(R.id.tt_qqnumb);
        phoneNumb = (TextView) itemView.findViewById(R.id.tt_phonenumb);
        goodAt = (TextView) itemView.findViewById(R.id.tt_goodat_course);
        checkNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_check);
        messageNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_criticise);
        zanNumb = (TextView) itemView.findViewById(R.id.tt_somebody_numb_zan);
        image= (SimpleDraweeView) itemView.findViewById(R.id.image_somebody_dslogo);
    }
}
