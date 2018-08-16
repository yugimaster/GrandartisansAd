package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class FileListItem {

    private int id;
    private int status;

    @SerializedName("advertid")
    private int adId;

    private String name;
    private String filePath;
    private int fileSize;
    private String fileMd5;

    @SerializedName("videoDuration")
    private int duration;

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

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public int getAdId() {
        return adId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
