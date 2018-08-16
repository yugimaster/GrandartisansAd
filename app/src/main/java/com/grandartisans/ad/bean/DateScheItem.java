package com.grandartisans.ad.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DateScheItem {

    private DateSchedule dateSchedule;

    @SerializedName("timeScheduleVos")
    private List<TimeScheItem> timeScheVos;

    public void setDateSchedule(DateSchedule dateSchedule) {
        this.dateSchedule = dateSchedule;
    }

    public DateSchedule getDateSchedule() {
        return dateSchedule;
    }

    public void setTimeScheVos(List<TimeScheItem> timeScheVos) {
        this.timeScheVos = timeScheVos;
    }

    public List<TimeScheItem> getTimeScheVos() {
        return timeScheVos;
    }
}
