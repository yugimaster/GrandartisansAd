package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class TokenApiResult<T> {

    @SerializedName("success")
    private boolean mSuccess;

    @SerializedName("status")
    private int mStatus;

    @SerializedName("msg")
    private String mMsg;

    @SerializedName("time")
    private String mTime;

    @SerializedName("data")
    private T mData;

    public void setmSuccess(boolean mSuccess) {
        this.mSuccess = mSuccess;
    }

    public boolean ismSuccess() {
        return mSuccess;
    }

    public void setmStatus(int mStatus) {
        this.mStatus = mStatus;
    }

    public int getmStatus() {
        return mStatus;
    }

    public void setmMsg(String mMsg) {
        this.mMsg = mMsg;
    }

    public String getmMsg() {
        return mMsg;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmData(T mData) {
        this.mData = mData;
    }

    public T getmData() {
        return mData;
    }
}
