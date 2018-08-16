package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class Advert {

    private int id;
    private int status;
    private String name;
    private String ident;
    private int type;
    private int vtype;
    private String ratio;

    @SerializedName("advertiserId")
    private int adId;

    @SerializedName("ratioid")
    private int ratioId;

    @SerializedName("advertSize")
    private int adSize;

    private int standard;

    @SerializedName("auditNumber")
    private int auditNum;

    private int fileSize;
    private int width;
    private int height;
    private int playType;
    private int auditOpinion;

    @SerializedName("description")
    private String desc;

    private String ext_rateName;
    private String ext_playTypeName;
    private String ext_typeName;
    private int ext_playCount;
    private int ext_positionCount;

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

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setVtype(int vtype) {
        this.vtype = vtype;
    }

    public int getVtype() {
        return vtype;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getRatio() {
        return ratio;
    }

    public void setAdId(int adId) {
        this.adId = adId;
    }

    public int getAdId() {
        return adId;
    }

    public void setRatioId(int ratioId) {
        this.ratioId = ratioId;
    }

    public int getRatioId() {
        return ratioId;
    }

    public void setAdSize(int adSize) {
        this.adSize = adSize;
    }

    public int getAdSize() {
        return adSize;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }

    public void setAuditNum(int auditNum) {
        this.auditNum = auditNum;
    }

    public int getAuditNum() {
        return auditNum;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
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

    public void setPlayType(int playType) {
        this.playType = playType;
    }

    public int getPlayType() {
        return playType;
    }

    public void setAuditOpinion(int auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public int getAuditOpinion() {
        return auditOpinion;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setExt_rateName(String  ext_rateName) {
        this.ext_rateName = ext_rateName;
    }

    public String getExt_rateName() {
        return ext_rateName;
    }

    public void setExt_playTypeName(String ext_playTypeName) {
        this.ext_playTypeName = ext_playTypeName;
    }

    public String getExt_playTypeName() {
        return ext_playTypeName;
    }

    public void setExt_typeName(String ext_typeName) {
        this.ext_typeName = ext_typeName;
    }

    public String getExt_typeName() {
        return ext_typeName;
    }

    public void setExt_playCount(int ext_playCount) {
        this.ext_playCount = ext_playCount;
    }

    public int getExt_playCount() {
        return ext_playCount;
    }

    public void setExt_positionCount(int ext_positionCount) {
        this.ext_positionCount = ext_positionCount;
    }

    public int getExt_positionCount() {
        return ext_positionCount;
    }
}
