package com.swpuiot.yikao.presenter;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.swpuiot.yikao.data.MyEntityList;

import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/3/31.
 */
public class ResourcePresenter implements ResourceHolder.presenter {
    private ResourceHolder.view mView;
    private Context mContext;
    private MyEntityList mEntityList;
    private List<String> StringList;
    private ArrayAdapter<String> Adapter;


    public ResourcePresenter(ResourceHolder.view view, Context context) {
        mView = view;
        mContext = context;
        mEntityList = MyEntityList.getMyEntityList();
    }
}
