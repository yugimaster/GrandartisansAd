package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class TimeSchedule {

    private int id;
    private int status;
    private String startTime;
    private String endTime;

    @SerializedName("dateScheduleId")
    private int dateScheId;

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
}
