package com.example.sonal.fooddiary;

import android.content.Context;
import android.os.Debug;
import android.widget.Toast;

/**
 * Created by Sonal on 4/9/2017.
 */

public class Log {

    private String name;
    private int calories;

    //static variables
    private static int totalcalories = 0;
    private static int totallogs = 0;

    //Operations

    //Constructor
    public Log(String newName, int newCal)
    {
        name = newName;
        calories = newCal;
        totalcalories += newCal;
        totallogs++;
    }
    public String getFood()
    {
        return name;
    }

    public int getCal()
    {
        return calories;
    }

    public int getLogs()
    {
        return totallogs;
    }
}
