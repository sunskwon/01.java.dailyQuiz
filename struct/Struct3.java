package com.ohgiraffers.struct;

public class Struct3 implements Comparable<Struct3>{

    private String name;
    private int score;

    public Struct3() {}

    public Struct3(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "Struct3{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Struct3 object) {
        if (object.score < score) {
            return -1;
        } else if (object.score > score) {
            return 1;
        }
        return 0;
    }
}
