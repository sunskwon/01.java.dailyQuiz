package com.ohgiraffers.test;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 수호는 30분 전으로 돌아가고 싶은 1人 이다.
        공백을 기준으로 시간과 분이 주어진다.
        그러면 이 시간을 기준으로 30분전의 시간을 출력하시오.

        예)
        12 35  =====> 12 5
        12 0 ======> 11 30
        11 5 ======> 10 35
        0 10 ======> 23 40
         */

        Application2 a = new Application2();
        a.thirtyMinBefore();
    }

    public void thirtyMinBefore() {

        Scanner sc = new Scanner(System.in);
        System.out.print("시를 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.print("분을 입력하세요 : ");
        int minute = sc.nextInt();

        System.out.println("입력한 시간은 " + hour + "시 " + minute + "분 입니다.");

        if (minute - 30 < 0) {

            if (hour - 1 <= 0) {

                hour += 11;
            } else {

                hour -= 1;
            }

            minute += 30;
        } else {

            minute -= 30;
        }

        System.out.println("입력한 시간의 30분 전 시간은 " + hour + "시 " + minute + "분 입니다.");
    }
}
