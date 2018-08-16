package com.grandartisans.ad.bean;

import java.util.List;

public class Template {

    private TemplateData template;
    private List<RegionList> regionList;

    public void setTemplate(TemplateData template) {
        this.template = template;
    }

    public TemplateData getTemplate() {
        return template;
    }

    public void setRegionList(List<RegionList> regionList) {
        this.regionList = regionList;
    }

    public List<RegionList> getRegionList() {
        return regionList;
    }
}
