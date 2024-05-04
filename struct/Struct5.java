package com.ohgiraffers.struct;

public class Struct5 implements Comparable<Struct5>{

    private String schedule;
    private int year;
    private int month;
    private int day;

    public Struct5() {}

    public Struct5(String schedule, int year, int month, int day) {
        this.schedule = schedule;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Struct5{" +
                "schedule='" + schedule + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(Struct5 struct5) {
        if (struct5.year > year) {
            return -1;
        } else if (struct5.year == year) {
            if (struct5.month > month) {
                return -1;
            } else if (struct5.month == month) {
                if (struct5.day > day) {
                    return -1;
                } else if (struct5.day < day) {
                    return 1;
                }
            } else if (struct5.month < month) {
                return 1;
            }
        } else if (struct5.year < year) {
            return 1;
        }
        return 0;
    }
}
