package com.a2017.hackers.hacktcnj2017;

import java.util.ArrayList;

/**
 * Created by user on 2/25/2017.
 */


public class Event {


    private String name;
    private String location;
    private String timeInformation;
    private ArrayList<User> mUsersList;

    public Event(String name, String location, String timeInformation, ArrayList<User> mUsersList) {
        this.name = name;
        this.location = location;
        this.timeInformation = timeInformation;
        this.mUsersList = mUsersList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimeInformation() {
        return timeInformation;
    }

    public void setTimeInformation(String timeInformation) {
        this.timeInformation = timeInformation;
    }

    public ArrayList<User> getmUsersList() {
        return mUsersList;
    }

    public void setmUsersList(ArrayList<User> mUsersList) {
        this.mUsersList = mUsersList;
    }
}