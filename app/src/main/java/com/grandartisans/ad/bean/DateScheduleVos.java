package com.grandartisans.ad.bean;

public class DateScheduleVos {

    private DateSchedule dateSchedule;
    private String timeScheduleVos;

    public void setDateSchedule(DateSchedule dateSchedule) {
        this.dateSchedule = dateSchedule;
    }

    public DateSchedule getDateSchedule() {
        return dateSchedule;
    }

    public void setTimeScheduleVos(String timeScheduleVos) {
        this.timeScheduleVos = timeScheduleVos;
    }

    public String getTimeScheduleVos() {
        return timeScheduleVos;
    }
}
