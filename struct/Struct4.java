package com.ohgiraffers.struct;

public class Struct4 implements Comparable<Struct4>{

    private String name;
    private int score1;
    private int score2;
    private int score3;

    public Struct4() {}

    public Struct4(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    @Override
    public String toString() {
        return "Struct4{" +
                "name='" + name + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                '}';
    }

    @Override
    public int compareTo(Struct4 struct4) {
        if (struct4.score1 > score1) {
            return 1;
        } else if (struct4.score1 < score1) {
            return -1;
        }
        return 0;
    }
}
