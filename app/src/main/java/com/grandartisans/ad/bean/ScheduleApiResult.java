package com.grandartisans.ad.bean;

public class ScheduleApiResult {

    private boolean success;
    private int status;
    private String msg;
    private String time;
    private ADScheduleData data;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setData(ADScheduleData data) {
        this.data = data;
    }

    public ADScheduleData getData() {
        return data;
    }
}
