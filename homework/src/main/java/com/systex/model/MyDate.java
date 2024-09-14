package com.systex.model;

import java.util.Comparator;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public static final Comparator<MyDate> MONTH_COMP = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            if(o1.getMonth() > o2.getMonth()) {
                return 1;
            } else if(o1.getMonth() < o2.getMonth()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    public static final Comparator<MyDate> DAY_COMP = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            if(o1.getDay() > o2.getDay()) {
                return 1;
            } else if(o1.getDay() < o2.getDay()) {
                return -1;
            } else {
                return 0;
            }
        }
    };

    public static final Comparator<MyDate> YEAR_MONTH_DAY_COMP = new Comparator<MyDate>() {
        @Override
        public int compare(MyDate o1, MyDate o2) {
            if(o1.getYear() > o2.getYear()) {
                return 1;
            } else if(o1.getYear() < o2.getYear()) {
                return -1;
            } else {
                if(o1.getMonth() > o2.getMonth()) {
                    return 1;
                } else if(o1.getMonth() < o2.getMonth()) {
                    return -1;
                } else {
                    if(o1.getDay() > o2.getDay()) {
                        return 1;
                    } else if(o1.getDay() < o2.getDay()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    };

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1970) {
            this.year = year;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MyDate) {
            MyDate date = (MyDate) obj;
            return this.year == date.year && this.month == date.month && this.day == date.day;
        }
        return false;
    }

    @Override
    public String toString() {
        return year + "/" + month + "/" + day;
    }

    @Override
    public int compareTo(MyDate o) {
        if(this.year > o.year) {
            return 1;
        }else if(this.year < o.year) {
            return -1;
        }else{
            return 0;
        }
    }
}
