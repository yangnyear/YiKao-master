package com.swpuiot.yikao.entities;

/**
 * Created by 羊荣毅_L on 2017/4/6.
 */

public class SomeBodyEntity {
    private String Name;
    private String Time;
    private String description;
    private int Greade;
    private String phoneNumb;
    private String goodsat;
    private int checkNunmb;
    private int zannumb;
    private int guanzhunumb;
    private int logid;

    public SomeBodyEntity(String name, String time, String description, int greade, String phoneNumb, String goodsat, int checkNunmb, int zannumb, int guanzhunumb, int logid) {
        Name = name;
        Time = time;
        this.description = description;
        Greade = greade;
        this.phoneNumb = phoneNumb;
        this.goodsat = goodsat;
        this.checkNunmb = checkNunmb;
        this.zannumb = zannumb;
        this.guanzhunumb = guanzhunumb;
        this.logid = logid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getGreade() {
        return Greade;
    }

    public void setGreade(int greade) {
        Greade = greade;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }

    public String getGoodsat() {
        return goodsat;
    }

    public void setGoodsat(String goodsat) {
        this.goodsat = goodsat;
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

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }
}
