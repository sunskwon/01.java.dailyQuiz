package com.ohgiraffers.quiz.Q240205;

import java.util.Scanner;

public class Number {

    private double number;
    private boolean isPositive;

    public Number() {

    }

    public void numberScan() {

        Scanner sc = new Scanner(System.in);

        System.out.print("임의의 숫자(소숫점 포함)를 입력하세요 : ");
        this.number = sc.nextDouble();
    }

    public void positiveNumber() {

        if (number >= 0) {

            this.isPositive = true;
        }
    }

    public void realNumberOrInteger() {

        Number number = new Number();

        if (isPositive) {

            if (this.number == 0) {

                System.out.println("입력하신 " + this.number + "은 0 입니다.");
            } else if ((this.number) % 1 == 0) {

                System.out.println("입력하신 " + this.number + "은(는) 0 이상의 정수입니다.");
            } else {

                System.out.println("입력하신 " + this.number + "은(는) 0 이상의 실수입니다.");
            }
        } else {

            System.out.println("입력하신 " + this.number + "은(는) 0 미만의 음수입니다.");
        }
    }
}
