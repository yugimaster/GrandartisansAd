package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

public class Advert {

    private long id;
    private Integer status;
    private String name;
    private String ident;
    private int type;
    private long vtype;
    private String ratio;

    @SerializedName("advertiserId")
    private int adId;

    @SerializedName("ratioid")
    private long ratioId;

    @SerializedName("advertSize")
    private String adSize;

    private String standard;

    @SerializedName("auditNumber")
    private String auditNum;

    private Integer fileSize;
    private int width;
    private int height;
    private long playType;
    private int auditOpinion;

    @SerializedName("description")
    private String desc;

    private String ext_rateName;
    private String ext_playTypeName;
    private String ext_typeName;
    private int ext_playCount;
    private int ext_positionCount;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
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

    public void setVtype(long vtype) {
        this.vtype = vtype;
    }

    public long getVtype() {
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

    public void setRatioId(long ratioId) {
        this.ratioId = ratioId;
    }

    public long getRatioId() {
        return ratioId;
    }

    public void setAdSize(String adSize) {
        this.adSize = adSize;
    }

    public String getAdSize() {
        return adSize;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }

    public void setAuditNum(String auditNum) {
        this.auditNum = auditNum;
    }

    public String getAuditNum() {
        return auditNum;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileSize() {
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

    public void setPlayType(long playType) {
        this.playType = playType;
    }

    public long getPlayType() {
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
