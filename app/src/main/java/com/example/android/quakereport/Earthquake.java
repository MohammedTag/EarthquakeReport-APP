package com.example.android.quakereport;

/**
 * Created by moshw on 11/2/2017.
 */

public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mTimeInMilliseconds;
    private String mURL;

    public String getmURL() {
        return mURL;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public Earthquake(double mMagnitude, String mPlace, long mTimeInMilliseconds ,String mURL) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mURL=mURL;
    }
}
