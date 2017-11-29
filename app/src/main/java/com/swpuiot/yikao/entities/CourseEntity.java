package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/1.
 */
public class CourseEntity {
    int courseImageId;
    String courseName;

    public CourseEntity(int courseImageId, String courseName) {
        this.courseImageId = courseImageId;
        this.courseName = courseName;
    }

    public int getCourseImageId() {
        return courseImageId;
    }

    public void setCourseImageId(int courseImageId) {
        this.courseImageId = courseImageId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
