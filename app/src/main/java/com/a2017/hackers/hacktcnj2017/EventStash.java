package com.a2017.hackers.hacktcnj2017;

import java.util.ArrayList;

/**
 * Created by user on 2/25/2017.
 */


public class EventStash {



    private static EventStash ourInstance = new EventStash();

    public ArrayList<Event> sListOfEvents = new ArrayList<>();

    public static EventStash getInstance() {

        return ourInstance;
    }

    private EventStash() {

    }







}