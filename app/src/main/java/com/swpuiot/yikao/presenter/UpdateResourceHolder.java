package com.swpuiot.yikao.presenter;

import java.io.File;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/9.
 */
public interface UpdateResourceHolder {
    interface view {

    }

    interface presenter {
        void loadStringContent(List<String> courseList);

        void loadGradeList(List<String> academyAdapter);

        void SendFile(String fileName, String fileproduce, String academyString, String depatmentString, String fileexcept);

        void bindFile(File file);
    }
}
