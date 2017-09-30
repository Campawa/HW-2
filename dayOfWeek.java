package com.company;

import java.util.*;
public class dayOfWeek {

    public String getDay(int answer){
        int weekend = answer;
        String weekends=null;
        switch (weekend) {
            case 1:  weekends = "Saturday";
                return weekends;
            case 2:  weekends= "Sunday";
                return weekends;
            default:
                return weekends;
        }

        //System.out.println(weekend);
    }
}
