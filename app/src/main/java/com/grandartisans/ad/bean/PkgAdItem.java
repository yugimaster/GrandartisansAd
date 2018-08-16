package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PkgAdItem {

    @SerializedName("advert")
    private Advert ad;

    private List<FileListItem> fileList;

    public void setAd(Advert ad) {
        this.ad = ad;
    }

    public Advert getAd() {
        return ad;
    }

    public void setFileList(List<FileListItem> fileList) {
        this.fileList = fileList;
    }

    public List<FileListItem> getFileList() {
        return fileList;
    }
}
