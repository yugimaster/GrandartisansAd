package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class AdvertPosition {

    private int id;
    private int status;
    private String updateTime;
    private String name;
    private String ident;
    private int width;
    private int height;
    private String rate;

    @SerializedName("rateid")
    private int rateId;

    private String startTime;
    private String endTime;
    private int version;

    @SerializedName("isupdate")
    private int isUpdate;

    private String audit;
    private int ext_groupid;

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

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateTime() {
        return updateTime;
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

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setRateId(int rateId) {
        this.rateId = rateId;
    }

    public int getRateId() {
        return rateId;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setIsUpdate(int isUpdate) {
        this.isUpdate = isUpdate;
    }

    public int getIsUpdate() {
        return isUpdate;
    }

    public void setAudit(String audit) {
        this.audit = audit;
    }

    public String getAudit() {
        return audit;
    }

    public void setExt_groupid(int ext_groupid) {
        this.ext_groupid = ext_groupid;
    }

    public int getExt_groupid() {
        return ext_groupid;
    }
}
