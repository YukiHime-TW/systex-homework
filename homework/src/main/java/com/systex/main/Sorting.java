package com.systex.main;

import java.util.Collections;
import java.util.LinkedList;

import com.systex.model.MyDate;

public class Sorting {
    public static void main(String[] args) {
        LinkedList<MyDate> dates = new LinkedList<>();

        // dummy data
        dates.add(new MyDate(2024, 9, 15));
        dates.add(new MyDate(2024, 7, 31));
        dates.add(new MyDate(2023, 8, 10));
        dates.add(new MyDate(2022, 6, 5));
        dates.add(new MyDate(1980, 6, 5));
        dates.add(new MyDate(2024, 9, 14));
        dates.add(new MyDate(2023, 7, 19));
        dates.add(new MyDate(2023, 9, 20));
        dates.add(new MyDate(2023, 8, 31));
        dates.add(new MyDate(2019, 12, 31));

        // for(int i = 0; i < 10; i++) {
        //     // random year, month, day
        //     int year = (int)(Math.random() * 121) + 1900;
        //     int month = (int)(Math.random() * 12) + 1;
        //     int day = (int)(Math.random() * 31) + 1;
        //     dates.add(new MyDate(year, month, day));
        // }

        System.out.println("Before sorting:");
        dates.forEach(System.out::println);
        System.out.println("======================");
        switch (args[0]) {
            case "1":
                Collections.sort(dates, MyDate.YEAR_MONTH_DAY_COMP);
                System.out.println("After sorting:");
                dates.forEach(System.out::println);
                break;
            case "2":
                Collections.sort(dates, MyDate.YEAR_MONTH_DAY_COMP.reversed());
                System.out.println("After sorting:");
                dates.forEach(System.out::println);
                break;
            default:
                System.out.println("wrong input");
                break;
        }
    }
}
