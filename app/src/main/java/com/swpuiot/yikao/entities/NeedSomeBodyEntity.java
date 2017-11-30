package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/12.
 */
public class NeedSomeBodyEntity {

    /**
     * id : 1
     * pubId : 4
     * academy : 计科院
     * pubGrade : 1
     * helpSubject : C#
     * helpNeed : 马上要考试了，求一位C#成绩好的大神
     * pubPhone : 15845625812
     */

    private int id;
    private int pubId;
    private String academy;
    private int pubGrade;
    private String helpSubject;
    private String helpNeed;
    private String pubPhone;

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

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }

    public String getHelpSubject() {
        return helpSubject;
    }

    public void setHelpSubject(String helpSubject) {
        this.helpSubject = helpSubject;
    }

    public String getHelpNeed() {
        return helpNeed;
    }

    public void setHelpNeed(String helpNeed) {
        this.helpNeed = helpNeed;
    }

    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }

}
