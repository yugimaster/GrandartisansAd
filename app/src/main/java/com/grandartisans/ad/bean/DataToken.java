package com.grandartisans.ad.bean;

public class DataToken {

    private String deviceClientid;
    private String token;
    private long times;

    public void setDeviceClientid(String deviceClientid) {
        this.deviceClientid = deviceClientid;
    }

    public String getDeviceClientid() {
        return deviceClientid;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setTimes(long times) {
        this.times = times;
    }

    public long getTimes() {
        return times;
    }
}
