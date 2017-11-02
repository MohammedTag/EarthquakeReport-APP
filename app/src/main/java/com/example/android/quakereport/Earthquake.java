package com.example.android.quakereport;

/**
 * Created by moshw on 11/2/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mPlace;
    private String mDate;

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public void setmPlace(String mPlace) {
        this.mPlace = mPlace;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }


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
