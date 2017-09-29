package com.example.android.quakereport;


import java.util.Date;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private int mDate;

    public Earthquake(double magnitude, String location, int date) {
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

    public int getmDate() {
        return mDate;
    }
}
