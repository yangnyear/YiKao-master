package com.swpuiot.yikao.adapter.somebodyneeds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.NeedSomeBodyEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class SomoBodyNeedsAdapter extends RecyclerView.Adapter<SomoBodyNeedsAdapter.SomoBodyNeedsHolderr> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<NeedSomeBodyEntity> mNeedSomeBodyEntityList;

    public SomoBodyNeedsAdapter(Context context, List<NeedSomeBodyEntity> needSomeBodyEntityList) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mNeedSomeBodyEntityList = needSomeBodyEntityList;
    }

    @Override
    public SomoBodyNeedsHolderr onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = mInflater.inflate(R.layout.item_need_somebody_help, parent, false);
        SomoBodyNeedsHolderr holder = new SomoBodyNeedsHolderr(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(SomoBodyNeedsHolderr holder, int position) {
        holder.time.setText(mNeedSomeBodyEntityList.get(position).getTime());
        holder.logo.setImageResource(mNeedSomeBodyEntityList.get(position).getLogoid());
        holder.needsInfor.setText(mNeedSomeBodyEntityList.get(position).getDescription());
        holder.phoneNumb.setText(mNeedSomeBodyEntityList.get(position).getPhoneNumb());
        holder.academcal.setText(mNeedSomeBodyEntityList.get(position).getCourseName());
        holder.checkNumb.setText(mNeedSomeBodyEntityList.get(position).getCheckNunmb()+"");
        holder.messageNumb.setText(mNeedSomeBodyEntityList.get(position).getGuanzhunumb()+"");
        holder.zanNumb.setText(mNeedSomeBodyEntityList.get(position).getZannumb()+"");
    }


    @Override
    public int getItemCount() {
        return mNeedSomeBodyEntityList.size();
    }


    class SomoBodyNeedsHolderr extends RecyclerView.ViewHolder {
        public TextView time;
        public SimpleDraweeView logo;
        public TextView needsInfor;
        public TextView course;
        public TextView phoneNumb;
        public TextView academcal;
        public TextView checkNumb;
        public TextView messageNumb;
        public TextView zanNumb;

        public SomoBodyNeedsHolderr(View itemView) {
            super(itemView);
            time = (TextView) itemView.findViewById(R.id.tt_needs_somebody_time);
            logo = (SimpleDraweeView) itemView.findViewById(R.id.image_needs_somebody_logo);
            needsInfor = (TextView) itemView.findViewById(R.id.tt_needs_somebody_infor);
            course = (TextView) itemView.findViewById(R.id.tt_needs_somebody_course);
            phoneNumb = (TextView) itemView.findViewById(R.id.tt_needs_somebody_phone);
            academcal = (TextView) itemView.findViewById(R.id.tt_needs_somebody_accademycal);
            checkNumb = (TextView) itemView.findViewById(R.id.tt_needs_somebody_checknumb);
            messageNumb = (TextView) itemView.findViewById(R.id.tt_needs_somebody_messagenumb);
            zanNumb = (TextView) itemView.findViewById(R.id.tt_needs_somebody_zannumb);
        }

        /**
         * Created by 羊荣毅_L on 2017/4/12.
         */

    }
}