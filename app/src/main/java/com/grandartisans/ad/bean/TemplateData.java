package com.grandartisans.ad.bean;

public class TemplateData {

    private int id;
    private int status;
    private int locationCount;
    private int rateid;
    private int resolutionid;

    private String name;
    private String ident;
    private String rate;
    private String resolution;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getIdent() {
        return ident;
    }

    public void setLocationCount(int locationCount) {
        this.locationCount = locationCount;
    }

    public int getLocationCount() {
        return locationCount;
    }

    public void setRateid(int rateid) {
        this.rateid = rateid;
    }

    public int getRateid() {
        return rateid;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setResolutionid(int resolutionid) {
        this.resolutionid = resolutionid;
    }

    public int getResolutionid() {
        return resolutionid;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }
}
