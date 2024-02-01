package com.ohgiraffers.answer.kang;

import java.util.Scanner;

public class A240131 {

    public static void main(String[] args) {

        /* 임의의 정수를 입력받아 5의배수, 7의배수를 출력하는 프로그램을 만드세요.

         * --------------- 출력 예시 ---------------
         * 숫자를 입력하세요 :
         * 예1) 입력하신 숫자는 5의 배수입니다.
         * 예2) 입력하신 숫자는 5의 배수이면서 7의 배수입니다.
         * */

        A240131 a = new A240131();
        a.judge();
    }

    public void judge() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int num5 = num % 5;
        int num7 = num % 7;
        int num35 = num % 35;

        if (num35 == 0) {

            System.out.println("입력하신 숫자는 5의 배수이면서 7의 배수입니다.");
        } else if (num5 == 0) {

            System.out.println("입력하신 숫자는 5의 배수입니다.");
        } else if (num7 == 0) {

            System.out.println("입력하신 숫자는 7의 배수입니다.");
        }
    }
}
