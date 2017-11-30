package com.swpuiot.yikao.adapter.somebodyneeds;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.NeedSomeBodyEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class SomoBodyNeedsAdapter extends RecyclerView.Adapter<SomeBodyNeedsHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<NeedSomeBodyEntity> mNeedSomeBodyEntityList;

    public SomoBodyNeedsAdapter(Context context, List<NeedSomeBodyEntity> needSomeBodyEntityList) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mNeedSomeBodyEntityList = needSomeBodyEntityList;
    }

    @Override
    public SomeBodyNeedsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = mInflater.inflate(R.layout.item_need_somebody_help,parent,false);
        SomeBodyNeedsHolder holder = new SomeBodyNeedsHolder(itemview);
        return holder;
    }

    @Override
    public void onBindViewHolder(SomeBodyNeedsHolder holder, int position) {
//        holder.time.setText(mNeedSomeBodyEntityList.get(position).getTime());
//        holder.logo.setImageResource(mNeedSomeBodyEntityList.get(position).getLogoId());
//        holder.needsInfor.setText(mNeedSomeBodyEntityList.get(position).getNeedInfor());
//        holder.phoneNumb.setText(mNeedSomeBodyEntityList.get(position).getPhoneNumb());
//        holder.academcal.setText(mNeedSomeBodyEntityList.get(position).getAcumdate());
//        holder.checkNumb.setText(mNeedSomeBodyEntityList.get(position).getCheckNumb()+"");
//        holder.messageNumb.setText(mNeedSomeBodyEntityList.get(position).getMessageNumb()+"");
//        holder.zanNumb.setText(mNeedSomeBodyEntityList.get(position).getZanNumb()+"");
    }

    @Override
    public int getItemCount() {
        return mNeedSomeBodyEntityList.size();
    }
}
