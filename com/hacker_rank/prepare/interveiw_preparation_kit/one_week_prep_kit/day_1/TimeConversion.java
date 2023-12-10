package com.hacker_rank.prepare.interveiw_preparation_kit.one_week_prep_kit.day_1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeConversion {
    public static String timeConversion(String s) {
        try{    
            DateTimeFormatter input = DateTimeFormatter.ofPattern("hh:mm:ssa");
            DateTimeFormatter output = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime time = LocalTime.parse(s, input);
            return time.format(output);
        } catch(DateTimeParseException e){
            return "Invalid Time format";
        }
    }

    public static String timeConversion1(String s) {
        if(s.charAt(8) == 'P' && !s.substring(0, 2).equals("12")){
            int hour = Integer.parseInt(s.substring(0,2)) + 12;
            s = hour + s.substring(2, 8);
        }else if(s.charAt(8) == 'A' && s.substring(0, 2).equals("12")){
            int hour = Integer.parseInt(s.substring(0, 2)) - 12;
            s = "0"+ hour + s.substring(2, 8);
        } else{
            s = s.substring(0, 8);
        }
        return s;
    }


    public static void main(String[] args) {
        String s1 = "02:30:45AM";
        String s2 = "12:30:45PM";
        String s3 = "12:30:45AM";
        String s4 = "11:00:45PM";
        String s5 = "01:00:45PM";
        // System.out.println(s2.substring(0,8));
        System.out.println(timeConversion1(s1));
        System.out.println(timeConversion1(s2));
        System.out.println(timeConversion1(s3));
        System.out.println(timeConversion1(s4));
        System.out.println(timeConversion1(s5));
    }
}
