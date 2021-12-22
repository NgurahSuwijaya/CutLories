package com.dianmediana.tugasproject.model;

public class DataModelRecipe {

    String image;
    String header, desc, time, portion, tools, procedure;

    public DataModelRecipe(String image, String header, String desc, String time, String portion, String tools, String procedure) {
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.time = time;
        this.portion = portion;
        this.tools = tools;
        this.procedure = procedure;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public String getTools() {
        return tools;
    }

    public void setTools(String tools) {
        this.tools = tools;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }
}
