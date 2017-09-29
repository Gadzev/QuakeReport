package com.example.android.quakereport;


import java.util.Date;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;

    public Earthquake(double magnitude, String location, long date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmDate() {
        return mDate;
    }
}
