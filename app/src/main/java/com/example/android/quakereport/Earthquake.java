package com.example.android.quakereport;

/**
 * Created by moshw on 11/2/2017.
 */

public class Earthquake {
    private String mMagnitude;
    private String mPlace;
    private   String mDate;

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmPlace() {
        return mPlace;
    }

    public String getmDate() {
        return mDate;
    }

    public Earthquake(String mMagnitude, String mPlace, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mPlace = mPlace;
        this.mDate = mDate;
    }
}
