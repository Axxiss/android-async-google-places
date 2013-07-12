package io.github.axxiss.AsyncGooglePlaces.model;

/**
 * @author Axxiss
 */
public class OpeningHours {
    private String mOpenDay;

    private int mOpenHour;

    private int mOpenMinute;

    private String mCloseDay;

    private int mCloseHour;

    private int mCloseMinute;

    public String getOpenDay() {
        return mOpenDay;
    }

    public void setOpenDay(final String openDay) {
        mOpenDay = openDay;
    }

    public int getOpenHour() {
        return mOpenHour;
    }

    public void setOpenHour(final int openHour) {
        mOpenHour = openHour;
    }

    public int getOpenMinute() {
        return mOpenMinute;
    }

    public void setOpenMinute(final int openMinute) {
        mOpenMinute = openMinute;
    }

    public String getCloseDay() {
        return mCloseDay;
    }

    public void setCloseDay(final String closeDay) {
        mCloseDay = closeDay;
    }

    public int getCloseHour() {
        return mCloseHour;
    }

    public void setCloseHour(final int closeHour) {
        mCloseHour = closeHour;
    }

    public int getCloseMinute() {
        return mCloseMinute;
    }

    public void setCloseMinute(final int closeMinute) {
        mCloseMinute = closeMinute;
    }
}
