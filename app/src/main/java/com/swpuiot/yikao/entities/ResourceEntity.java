package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */
public class ResourceEntity {

    /**
     * id : 6
     * userId : 4
     * dataTitle : 管理学复习资料
     * dataDescription : 管理学是一门综合性的交叉学科，是系统研究管理活动的基本规律和一般方法的科学。管理学是适应现代社会化大生产的需要产生的，它的目的是：研究在现有的条件下，如何通过合理的组织和配置人、财、物等因素，提高生产力的水平。
     * dataUrl : /uploads/data/doc/2017/04/09/11/e2c77278-2632-4eaf-b6f8-f953bec3cefc.jpg
     * downloadNumber : 0
     * viewNumber : 1
     * dataPraise : 0
     * dataCategory : 管理学
     * dataImgs : /uploads/data/img/2017/04/09/11/d48a0316-6536-49ca-b063-edf030d32e50.jpg
     * dataGrade : 2
     * dataCollege : 经管院
     */

    private int id;
    private int userId;
    private String dataTitle;
    private String dataDescription;
    private String dataUrl;
    private int downloadNumber;
    private int viewNumber;
    private int dataPraise;
    private String dataCategory;
    private int dataImgs;
    private int dataGrade;
    private String dataCollege;
    private String pubDate;   //发布时间

    public ResourceEntity(int id, int userId, String dataTitle, String dataDescription, String dataUrl, int downloadNumber, int viewNumber, int dataPraise, String dataCategory, int dataImgs, int dataGrade, String dataCollege, String pubDate) {
        this.id = id;
        this.userId = userId;
        this.dataTitle = dataTitle;
        this.dataDescription = dataDescription;
        this.dataUrl = dataUrl;
        this.downloadNumber = downloadNumber;
        this.viewNumber = viewNumber;
        this.dataPraise = dataPraise;
        this.dataCategory = dataCategory;
        this.dataImgs = dataImgs;
        this.dataGrade = dataGrade;
        this.dataCollege = dataCollege;
        this.pubDate = pubDate;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

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

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getDataDescription() {
        return dataDescription;
    }

    public void setDataDescription(String dataDescription) {
        this.dataDescription = dataDescription;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    public int getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }

    public int getDataPraise() {
        return dataPraise;
    }

    public void setDataPraise(int dataPraise) {
        this.dataPraise = dataPraise;
    }

    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory;
    }

    public int getDataImgs() {
        return dataImgs;
    }

    public void setDataImgs(int dataImgs) {
        this.dataImgs = dataImgs;
    }

    public int getDataGrade() {
        return dataGrade;
    }

    public void setDataGrade(int dataGrade) {
        this.dataGrade = dataGrade;
    }

    public String getDataCollege() {
        return dataCollege;
    }

    public void setDataCollege(String dataCollege) {
        this.dataCollege = dataCollege;
    }
}
