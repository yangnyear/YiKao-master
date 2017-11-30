package com.swpuiot.yikao.presenter;

import android.content.Context;

import com.swpuiot.yikao.data.MyEntityList;
import com.swpuiot.yikao.data.NetWork;

import java.io.File;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/9.
 */
public class UpdateResourcePresenter implements UpdateResourceHolder.presenter {
    private Context mContext;
    private UpdateResourceHolder.view mView;
    private MyEntityList mEntityList;
    private File file;

    public UpdateResourcePresenter(Context context) {
        mContext = context;
        mView = (UpdateResourceHolder.view) context;
        mEntityList = MyEntityList.getMyEntityList();
    }

    @Override
    public void loadStringContent(List<String> courseList) {
        mEntityList.loadStringNameList(courseList);
    }

    @Override
    public void loadGradeList(List<String> academyAdapter) {
        mEntityList.loadGradeList(academyAdapter);
    }

    @Override
    public void SendFile(String fileName, String fileproduce, String academyString, String depatmentString, String fileexcept) {
        NetWork.sendFileToservers(file,fileName,fileproduce,academyString,depatmentString,fileexcept);
    }

    @Override
    public void bindFile(File file) {
        this.file=file;
    }


}
