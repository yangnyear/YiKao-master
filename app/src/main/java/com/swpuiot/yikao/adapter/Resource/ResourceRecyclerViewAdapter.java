package com.swpuiot.yikao.adapter.Resource;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.swpuiot.yikao.R;
import com.swpuiot.yikao.clicklistener.MyItemClickListener;
import com.swpuiot.yikao.clicklistener.MyItemLongClickListener;
import com.swpuiot.yikao.entities.ResourceEntity;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class ResourceRecyclerViewAdapter extends RecyclerView.Adapter<ResourceRecyclerViewAdapter.ResourceRecyclerViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private MyItemClickListener mClickListener;
    private MyItemLongClickListener mLongClickListener;
    private List<ResourceEntity> resourceList;

    public ResourceRecyclerViewAdapter(Context context, List<ResourceEntity> resourceList) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        this.resourceList = resourceList;
    }

    @Override
    public ResourceRecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.item_resource,parent,false);
        ResourceRecyclerViewHolder holder=new ResourceRecyclerViewHolder(itemView,mClickListener,mLongClickListener);
        return holder;
    }

    @Override
    public void onBindViewHolder(ResourceRecyclerViewHolder holder, int position) {
        holder.RSName.setText(resourceList.get(position).getDataTitle());
        holder.RSprice.setText("0积分");
        holder.RSdescription.setText(resourceList.get(position).getDataDescription());
        holder.RSCategory.setText(resourceList.get(position).getDataCategory());
        holder.RSViewNumb.setText(resourceList.get(position).getViewNumber());
        holder.RSdowloadNumb.setText(resourceList.get(position).getDownloadNumber());
        holder.RSzanNumb.setText(resourceList.get(position).getDataPraise());
        holder.RSicon.setImageURI(Uri.parse(resourceList.get(position).getDataImgs()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * Created by 羊荣毅_L on 2017/4/6.
     */
    class ResourceRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        public TextView RSName;
        public TextView RSprice;
        public TextView RSdescription;
        public TextView RSCategory;
        public TextView RSViewNumb;
        public TextView RSdowloadNumb;
        public TextView RSzanNumb;
        public SimpleDraweeView RSicon;
        public MyItemClickListener mClickListener;
        public MyItemLongClickListener mLongClickListener;

        public ResourceRecyclerViewHolder(View itemView, MyItemClickListener clickListener, MyItemLongClickListener longClickListener) {
            super(itemView);
            RSName = (TextView) itemView.findViewById(R.id.tt_item_name_goodsname);
            RSprice = (TextView) itemView.findViewById(R.id.tt_item_goods_worth);
            RSdescription = (TextView) itemView.findViewById(R.id.tt_item_goods_information);
            RSCategory = (TextView) itemView.findViewById(R.id.tt_kemu);
            RSViewNumb = (TextView) itemView.findViewById(R.id.tt_resource_numb_check);
            RSdowloadNumb = (TextView) itemView.findViewById(R.id.tt_resource_numb_download);
            RSzanNumb= (TextView) itemView.findViewById(R.id.tt_resource_numb_zan);
            RSicon= (SimpleDraweeView) itemView.findViewById(R.id.image_item_goods);

            this.mLongClickListener = longClickListener;
            this.mClickListener = clickListener;
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (itemView != null) {
                mClickListener.onItemClick(resourceList, getPosition());
            }
        }

        @Override
        public boolean onLongClick(View v) {
            if (itemView != null) {
                mLongClickListener.onItemLongClick(resourceList, getPosition());
            }
            return true;
        }
    }
}
