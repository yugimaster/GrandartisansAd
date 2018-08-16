package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TimeScheItem {

    private TimeSchedule timeSchedule;

    @SerializedName("packageAdverts")
    private List<PkgAdItem> pkgAd;

    public void setTimeSchedule(TimeSchedule timeSchedule) {
        this.timeSchedule = timeSchedule;
    }

    public TimeSchedule getTimeSchedule() {
        return timeSchedule;
    }

    public void setPkgAd(List<PkgAdItem> pkgAd) {
        this.pkgAd = pkgAd;
    }

    public List<PkgAdItem> getPkgAd() {
        return pkgAd;
    }
}
