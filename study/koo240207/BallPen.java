package com.ohgiraffers.study.koo240207;

public class BallPen extends Pen {

    private String color;

    public BallPen() {

    }

    public BallPen(String color) {

        this.color = color;
    }

    public BallPen(int amount, String color) {

        super(amount);

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }
}
