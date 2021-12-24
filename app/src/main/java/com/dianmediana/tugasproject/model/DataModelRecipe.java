package com.dianmediana.tugasproject.model;

public class DataModelRecipe {

    String image;
    int id,id_user;
    String header, desc, time, portion, tools, procedure;

    public DataModelRecipe(int id, int id_user, String header, String desc, String time, String portion, String tools, String procedure, String image) {
        this.id = id;
        this.id_user = id_user;
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.time = time;
        this.portion = portion;
        this.tools = tools;
        this.procedure = procedure;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
