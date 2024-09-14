package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {
    public static void main(String[] args) {
        LinkedList<MyDate> dates = new LinkedList<>();

        for(int i = 0; i < 10; i++) {
            // random year, month, day
            int year = (int)(Math.random() * 121) + 1900;
            int month = (int)(Math.random() * 12) + 1;
            int day = (int)(Math.random() * 31) + 1;
            dates.add(new MyDate(year, month, day));
        }

        System.out.println("Before sorting:");
        dates.forEach(System.out::println);
        System.out.println("======================");
        Collections.sort(dates, MyDate.YEAR_MONTH_DAY_COMP);
        System.out.println("After sorting year:");
        dates.forEach(System.out::println);
    }
}
