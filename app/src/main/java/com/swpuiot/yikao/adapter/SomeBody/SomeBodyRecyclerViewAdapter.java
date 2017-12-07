package com.swpuiot.yikao.adapter.SomeBody;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.SomeBodyEntity;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyRecyclerViewAdapter extends RecyclerView.Adapter<SomeBodyRecyclerViewAdapter.SomeBodyRecyclerViewHolder> {
    private LayoutInflater mInflater;
    private Context mContext;
    private List<SomeBodyEntity> mSomeBodyEntities;

    public SomeBodyRecyclerViewAdapter(Context context, List<SomeBodyEntity> someBodyEntities) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mSomeBodyEntities = someBodyEntities;
    }

    @Override
    public SomeBodyRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_somebody_info, parent, false);
        SomeBodyRecyclerViewHolder holder = new SomeBodyRecyclerViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(SomeBodyRecyclerViewHolder holder, int position) {
        holder.name.setText(mSomeBodyEntities.get(position).getName());
        holder.time.setText(mSomeBodyEntities.get(position).getTime());
        holder.prooduce.setText(mSomeBodyEntities.get(position).getDescription());
        holder.jidian.setText(mSomeBodyEntities.get(position).getGreade()+"");
        holder.phoneNumb.setText(mSomeBodyEntities.get(position).getPhoneNumb());
        holder.goodAt.setText(mSomeBodyEntities.get(position).getGoodsat());
        holder.checkNumb.setText(+mSomeBodyEntities.get(position).getCheckNunmb()+"");
        holder.messageNumb.setText(mSomeBodyEntities.get(position).getGuanzhunumb()+"");
        holder.zanNumb.setText(mSomeBodyEntities.get(position).getZannumb()+"");
        holder.image.setImageResource(mSomeBodyEntities.get(position).getLogid());
    }

    @Override
    public int getItemCount() {
        return mSomeBodyEntities.size();
    }

    /**
     * Created by 羊荣毅_L on 2017/4/6.
     */
    class SomeBodyRecyclerViewHolder extends RecyclerView.ViewHolder {
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
}
