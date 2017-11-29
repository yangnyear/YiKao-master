package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/15.
 */
public class DocSeekEntity {

    /**
     * id : 2
     * pubId : 1
     * seekTitle : 高等数学
     * seekNeed : 求大神带高等数学，希望上90分
     * needAcademy : 机电工程学院
     * needGrade : 1
     * seekTime : 1
     * seekPraise : 1
     * pubDate : 2017/04/08 23:51
     */

    private int id;
    private int pubId;
    private String seekTitle;
    private String seekNeed;
    private String needAcademy;
    private String needGrade;
    private int seekTime;
    private int seekPraise;
    private String pubDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public String getSeekTitle() {
        return seekTitle;
    }

    public void setSeekTitle(String seekTitle) {
        this.seekTitle = seekTitle;
    }

    public String getSeekNeed() {
        return seekNeed;
    }

    public void setSeekNeed(String seekNeed) {
        this.seekNeed = seekNeed;
    }

    public String getNeedAcademy() {
        return needAcademy;
    }

    public void setNeedAcademy(String needAcademy) {
        this.needAcademy = needAcademy;
    }

    public String getNeedGrade() {
        return needGrade;
    }

    public void setNeedGrade(String needGrade) {
        this.needGrade = needGrade;
    }

    public int getSeekTime() {
        return seekTime;
    }

    public void setSeekTime(int seekTime) {
        this.seekTime = seekTime;
    }

    public int getSeekPraise() {
        return seekPraise;
    }

    public void setSeekPraise(int seekPraise) {
        this.seekPraise = seekPraise;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
