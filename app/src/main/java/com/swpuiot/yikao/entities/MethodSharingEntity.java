package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/15.
 */
public class MethodSharingEntity {

    /**
     * id : 27
     * userId : 7
     * academy : 计科院
     * sharingTitle : 高数学习方法
     * sharingContent : 高等数学学习方法分享
     * sharingPraise : 0
     * sharingCriticism : 0
     * readingNumber : 1
     * readingImgs : null
     */

    private int id;
    private int userId;
    private String academy;
    private String sharingTitle;
    private String sharingContent;
    private int sharingPraise;
    private int sharingCriticism;
    private int readingNumber;
    private Object readingImgs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getSharingTitle() {
        return sharingTitle;
    }

    public void setSharingTitle(String sharingTitle) {
        this.sharingTitle = sharingTitle;
    }

    public String getSharingContent() {
        return sharingContent;
    }

    public void setSharingContent(String sharingContent) {
        this.sharingContent = sharingContent;
    }

    public int getSharingPraise() {
        return sharingPraise;
    }

    public void setSharingPraise(int sharingPraise) {
        this.sharingPraise = sharingPraise;
    }

    public int getSharingCriticism() {
        return sharingCriticism;
    }

    public void setSharingCriticism(int sharingCriticism) {
        this.sharingCriticism = sharingCriticism;
    }

    public int getReadingNumber() {
        return readingNumber;
    }

    public void setReadingNumber(int readingNumber) {
        this.readingNumber = readingNumber;
    }

    public Object getReadingImgs() {
        return readingImgs;
    }

    public void setReadingImgs(Object readingImgs) {
        this.readingImgs = readingImgs;
    }
}
