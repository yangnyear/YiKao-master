package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class NeedSomeBodyEntity {
    private int logoid;
    private String time;
    private String description;
    private String courseName;
    private String phoneNumb;
    private String college;
    private int checkNunmb;
    private int zannumb;
    private int guanzhunumb;

    public NeedSomeBodyEntity(int logoid, String time, String description, String courseName, String phoneNumb, String college, int checkNunmb, int zannumb, int guanzhunumb) {
        this.logoid = logoid;
        this.time = time;
        this.description = description;
        this.courseName = courseName;
        this.phoneNumb = phoneNumb;
        this.college = college;
        this.checkNunmb = checkNunmb;
        this.zannumb = zannumb;
        this.guanzhunumb = guanzhunumb;
    }

    public int getLogoid() {
        return logoid;
    }

    public void setLogoid(int logoid) {
        this.logoid = logoid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getCheckNunmb() {
        return checkNunmb;
    }

    public void setCheckNunmb(int checkNunmb) {
        this.checkNunmb = checkNunmb;
    }

    public int getZannumb() {
        return zannumb;
    }

    public void setZannumb(int zannumb) {
        this.zannumb = zannumb;
    }

    public int getGuanzhunumb() {
        return guanzhunumb;
    }

    public void setGuanzhunumb(int guanzhunumb) {
        this.guanzhunumb = guanzhunumb;
    }
}
