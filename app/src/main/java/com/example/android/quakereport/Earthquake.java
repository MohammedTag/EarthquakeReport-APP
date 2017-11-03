package com.example.android.quakereport;

/**
 * Created by moshw on 11/2/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;

    /*public void setmMagnitude(double mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public void setTimeInMilliseconds(long mDate) {
        this.mTimeInMilliseconds = mDate;
    }*/


    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public Earthquake(double mMagnitude, String mPlace, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }
}
