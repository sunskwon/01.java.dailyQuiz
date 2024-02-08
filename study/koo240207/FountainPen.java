package com.ohgiraffers.study.koo240207;

public class FountainPen extends BallPen {

    public FountainPen() {

    }

    public FountainPen(int amount, String color) {

        super(amount, color);

    }

    public void refill(int n){

        setAmount(n);
    }
}
