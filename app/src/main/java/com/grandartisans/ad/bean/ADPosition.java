package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ADPosition {

    @SerializedName("dateScheduleVos")
    private List<DateScheItem> vos;

    @SerializedName("advertPosition")
    private AdvertPosition pos;

    public void setVos(List<DateScheItem> vos) {
        this.vos = vos;
    }

    public List<DateScheItem> getVos() {
        return vos;
    }

    public void setPos(AdvertPosition pos) {
        this.pos = pos;
    }

    public AdvertPosition getPos() {
        return pos;
    }
}
