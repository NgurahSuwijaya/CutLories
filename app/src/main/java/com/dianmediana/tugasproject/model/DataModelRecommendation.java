package com.dianmediana.tugasproject.model;

public class DataModelRecommendation {

    int image;
    String header, desc, recommend, avoid;

    public DataModelRecommendation(int image, String header, String desc, String recommend, String avoid) {
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.recommend = recommend;
        this.avoid = avoid;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getAvoid() {
        return avoid;
    }

    public void setAvoid(String avoid) {
        this.avoid = avoid;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
