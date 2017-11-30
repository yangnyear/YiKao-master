package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class NewsEntity {
    private String newsName;
    private String course;
    private String newsTime;
    private int checknumb;
    private int messageNumb;
    private int zanNumb;
    private int imageId;

    public NewsEntity(String newsName, String course, String newsTime, int checknumb, int messageNumb, int zanNumb, int imageId) {
        this.newsName = newsName;
        this.course = course;
        this.newsTime = newsTime;
        this.checknumb = checknumb;
        this.messageNumb = messageNumb;
        this.zanNumb = zanNumb;
        this.imageId = imageId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }

    public int getChecknumb() {
        return checknumb;
    }

    public void setChecknumb(int checknumb) {
        this.checknumb = checknumb;
    }

    public int getMessageNumb() {
        return messageNumb;
    }

    public void setMessageNumb(int messageNumb) {
        this.messageNumb = messageNumb;
    }

    public int getZanNumb() {
        return zanNumb;
    }

    public void setZanNumb(int zanNumb) {
        this.zanNumb = zanNumb;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
