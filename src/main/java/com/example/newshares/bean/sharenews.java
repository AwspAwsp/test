package com.example.newshares.bean;

public class sharenews {//编写股票属性类
    private int number;
    private String name;
    private float newprice;
    private String upanddown;
    private String uppercent;
    private float upprice;
    private String deal;
    private String amplitute;
    private String top;
    private String low;
    private String todayprice;
    private String yesterdy;
    private String Lmr;
    private String turnoverrate;
    private String ttm;
    private String PBV;

    public float getNewprice() {
        return newprice;
    }

    public float getUpprice() {
        return upprice;
    }

    public int getNumber() {
        return number;
    }

    public String getAmplitute() {
        return amplitute;
    }

    public String getDeal() {
        return deal;
    }

    public String getLmr() {
        return Lmr;
    }

    public String getLow() {
        return low;
    }

    public String getName() {
        return name;
    }

    public String getPBV() {
        return PBV;
    }

    public String getTodayprice() {
        return todayprice;
    }

    public String getTop() {
        return top;
    }

    public String getTtm() {
        return ttm;
    }

    public String getTurnoverrate() {
        return turnoverrate;
    }

    public String getUpanddown() {
        return upanddown;
    }

    public String getUppercent() {
        return uppercent;
    }

    public String getYesterdy() {
        return yesterdy;
    }

    public void setAmplitute(String amplitute) {
        this.amplitute = amplitute;
    }

    public void setDeal(String deal) {
        this.deal = deal;
    }

    public void setLmr(String lmr) {
        Lmr = lmr;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewprice(float newprice) {
        this.newprice = newprice;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPBV(String PBV) {
        this.PBV = PBV;
    }

    public void setTodayprice(String todayprice) {
        this.todayprice = todayprice;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public void setTtm(String ttm) {
        this.ttm = ttm;
    }

    public void setTurnoverrate(String turnoverrate) {
        this.turnoverrate = turnoverrate;
    }

    public void setUpanddown(String upanddown) {
        this.upanddown = upanddown;
    }

    public void setUppercent(String uppercent) {
        this.uppercent = uppercent;
    }

    public void setUpprice(float upprice) {
        this.upprice = upprice;
    }

    public void setYesterdy(String yesterdy) {
        this.yesterdy = yesterdy;
    }
}
