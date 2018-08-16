package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class RegionList {

    private int id;
    private int status;

    @SerializedName("templateid")
    private int templateId;

    private String templateName;
    private int regionIndex;
    private String name;
    private int width;
    private int height;

    @SerializedName("rateid")
    private int rateId;

    private String rate;
    private String location;
    private String ident;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setRegionIndex(int regionIndex) {
        this.regionIndex = regionIndex;
    }

    public int getRegionIndex() {
        return regionIndex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getRateId() {
        return rateId;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getIdent() {
        return ident;
    }
}
