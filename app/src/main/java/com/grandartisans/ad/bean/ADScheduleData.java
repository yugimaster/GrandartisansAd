package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class ADScheduleData {

    @SerializedName("deviceClientid")
    private String devTid;

    private Template template;
    private Map<String, String> relationMap;

    @SerializedName("advertPositionMap")
    private Map<String, ADPosition> adPosMap;

    public void setDevTid(String devTid) {
        this.devTid = devTid;
    }

    public String getDevTid() {
        return devTid;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Template getTemplate() {
        return template;
    }

    public void setRelationMap(Map<String, String> relationMap) {
        this.relationMap = relationMap;
    }

    public Map<String, String> getRelationMap() {
        return relationMap;
    }

    public void setAdPosMap(Map<String, ADPosition> adPosMap) {
        this.adPosMap = adPosMap;
    }

    public Map<String, ADPosition> getAdPosMap() {
        return adPosMap;
    }
}
