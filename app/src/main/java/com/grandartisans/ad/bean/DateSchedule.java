package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class DateSchedule {

    private int id;
    private int status;

    @SerializedName("advertPositionId")
    private int adPosId;

    private String startDate;
    private String endDate;

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

    public void setAdPosId(int adPosId) {
        this.adPosId = adPosId;
    }

    public int getAdPosId() {
        return adPosId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
