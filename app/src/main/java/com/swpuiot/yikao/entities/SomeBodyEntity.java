package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class SomeBodyEntity {

    /**
     * id : 9
     * pubId : 7
     * pubGrade : 2
     * academy : 计科院
     * studySubject : 数据结构
     * pubDescription : 数据结构90分
     * shareScore : 4
     * pubPhone : 1095121033
     * viewNumb : 0
     * commentNumb : 0
     * praiseNumb : 0
     * time : null
     * userPortrait : /static/img/touxiang.png
     */

    private int id;
    private int pubId;
    private int pubGrade;
    private String academy;
    private String studySubject;
    private String pubDescription;
    private int shareScore;
    private String pubPhone;
    private int viewNumb;
    private int commentNumb;
    private int praiseNumb;
    private String time;
    private String userPortrait;

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

    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(String studySubject) {
        this.studySubject = studySubject;
    }

    public String getPubDescription() {
        return pubDescription;
    }

    public void setPubDescription(String pubDescription) {
        this.pubDescription = pubDescription;
    }

    public int getShareScore() {
        return shareScore;
    }

    public void setShareScore(int shareScore) {
        this.shareScore = shareScore;
    }

    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }

    public int getViewNumb() {
        return viewNumb;
    }

    public void setViewNumb(int viewNumb) {
        this.viewNumb = viewNumb;
    }

    public int getCommentNumb() {
        return commentNumb;
    }

    public void setCommentNumb(int commentNumb) {
        this.commentNumb = commentNumb;
    }

    public int getPraiseNumb() {
        return praiseNumb;
    }

    public void setPraiseNumb(int praiseNumb) {
        this.praiseNumb = praiseNumb;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }
}
