package com.ohgiraffers.struct;

public class Struct10 implements Comparable<Struct10>{

    private int national;
    private int entry;
    private int score;

    public Struct10() {}

    public Struct10(int national, int entry, int score) {
        this.national = national;
        this.entry = entry;
        this.score = score;
    }

    public int getNational() {
        return national;
    }

    public void setNational(int national) {
        this.national = national;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Struct10{" +
                "national=" + national +
                ", entry=" + entry +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Struct10 struct10) {
        if (struct10.score > score) {
            return 1;
        } else {
            return -1;
        }
    }
}
