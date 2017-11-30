package com.swpuiot.yikao.data;

import com.swpuiot.yikao.R;
import com.swpuiot.yikao.entities.CourseEntity;
import com.swpuiot.yikao.entities.NewsEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/3.
 * 单例模式下的
 */
public class MyEntityList {
    private static volatile MyEntityList sMyEntityList;
    private static List<CourseEntity> coursList = new ArrayList<>();

    private MyEntityList() {
    }

    public static MyEntityList getMyEntityList() {
        if (sMyEntityList == null) {
            synchronized (MyEntityList.class) {
                if (sMyEntityList == null) {
                    sMyEntityList = new MyEntityList();
                }
            }
        }
        return sMyEntityList;
    }

    public void loadImageList(List<Integer> mIntegers) {
        mIntegers.add(R.drawable.slide1);
        mIntegers.add(R.drawable.slide2);

    }

    public List<CourseEntity> getCousdeList() {
        if (coursList.size() == 0) {
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_math, "高数"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_english, "English"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_think_hehavior, "思修"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_linear_algebra, "线代"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_hestory, "近代史"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_probability_statistics, "概率"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_thinking_of_mao, "毛概"));
            coursList.add(new CourseEntity(R.drawable.ic_abc_image_thinking_max, "马原"));
        }
        return coursList;
    }

    public void loadStringNameList(List<String> academyAdapter) {
        if (academyAdapter.size() == 0) {
            academyAdapter.add("计科院");
            academyAdapter.add("石工院");
            academyAdapter.add("化工院");
            academyAdapter.add("材科院");
            academyAdapter.add("地科院");
            academyAdapter.add("电信院");
            academyAdapter.add("法学院");
            academyAdapter.add("机电院");
            academyAdapter.add("理学院");
            academyAdapter.add("土建院");
            academyAdapter.add("艺术院");
        }
    }

    public void loadGradeList(List<String> courseList) {
        if (courseList.size() == 0) {
            courseList.add("大一");
            courseList.add("大二");
            courseList.add("大三");
            courseList.add("大四");
        }
    }

//    public void getSomeBodyList(List<SomeBodyEntity> someBodyEntityList) {
//        if (someBodyEntityList.size() == 0) {
//            someBodyEntityList.add(new SomeBodyEntity("小羊", "昨天11.00", "计科院皮皮学长", 5, "1101101119", "Java,Android,SqlSerVer", 200, 40, 567, R.drawable.ic_image_my_logo));
//            someBodyEntityList.add(new SomeBodyEntity("大老板", "22分钟前", "西柚扛把子", 4, "1101101119", "高数,现代,概率", 200, 40, 567, R.drawable.ic_image_user));
//            someBodyEntityList.add(new SomeBodyEntity("冬日艳阳", "上周", "土建萌妹纸", 5, "1101101119", "工程力学,空间结构学r", 200, 40, 567, R.drawable.ic_abc_image_turn6));
//            someBodyEntityList.add(new SomeBodyEntity("小羊", "昨天11.00", "计科院皮皮学长", 5, "1101101119", "Java,Android,SqlSerVer", 200, 40, 567, R.drawable.ic_image_text));
//            someBodyEntityList.add(new SomeBodyEntity("小羊", "昨天11.00", "计科院皮皮学长", 5, "1101101119", "Java,Android,SqlSerVer", 200, 40, 567, R.drawable.ic_image_text));
//            someBodyEntityList.add(new SomeBodyEntity("小羊", "昨天11.00", "计科院皮皮学长", 5, "1101101119", "Java,Android,SqlSerVer", 200, 40, 567, R.drawable.ic_image_text));
//        }
//    }

//    public void getNeedsList(List<NeedSomeBodyEntity> needSomeBodyEntities) {
//        if (needSomeBodyEntities.size() == 0) {
//            for (int i = 0; i < 10; i++) {
//                needSomeBodyEntities.add(new NeedSomeBodyEntity(R.drawable.ic_image_my_logo, "11分钟前",
//                        "我是计科院物联网工程的一位皮皮学长,期末了需要找个大神辅导一下计算机组成原理",
//                        "计算机组成原理", "110110119", "计科院", 100, 200, 400));
//            }
//
//        }
//    }

    public void getNewsList(List<NewsEntity> newsList) {
        if (newsList.size()==0){
            for (int i = 0; i < 10; i++) {
                newsList.add(new NewsEntity("新的资料来了,您要找的C++资料来了","C++","11分钟前",200,100,30,R.drawable.ic_image_text));
                newsList.add(new NewsEntity("新的资料来了,您要找的C++资料来了","C++","11分钟前",200,100,30,R.drawable.ic_image_help));
            }
        }
    }
}
