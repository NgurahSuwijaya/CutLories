package com.dianmediana.tugasproject.model;

public class DataModelTips {

    String image, header, source, date, urls;

    public DataModelTips(String image, String header, String source, String date, String urls) {
        this.image = image;
        this.header = header;
        this.source = source;
        this.date = date;
        this.urls = urls;
    }

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
