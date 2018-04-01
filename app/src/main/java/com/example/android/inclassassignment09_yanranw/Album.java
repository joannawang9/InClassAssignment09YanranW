package com.example.android.inclassassignment09_yanranw;

/**
 * Created by joan on 4/1/18.
 */

public class Album {
    public String title;
    public int year;
    public boolean isAvailable;

    public Album(String title, int year, boolean isAvailable) {
        this.title = title;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean mAvailable) {
        isAvailable = mAvailable;
    }
}