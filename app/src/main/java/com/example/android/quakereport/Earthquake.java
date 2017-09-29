package com.example.android.quakereport;


import java.util.Date;

public class Earthquake {

    private float mMagnitude;
    private String mLocation;
    private Date mDate;

    public Earthquake(float magnitude, String location, Date date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public float getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Date getmDate() {
        return mDate;
    }
}
