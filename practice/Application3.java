package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 어떤 숫자가 입력되면 그 숫자가 몇 자릿수 숫자인지 알아내는 프로그램을 작성하시오.

        예)
        7   ----> 1   (1자릿수)
        10  ----> 2   (2자릿수)
        4322 ----> 4   (4자릿수)
         */

        Application3 a = new Application3();
        a.digitOfNumber();
    }

    public void digitOfNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.print("임의의 양의 정수를 입력해주세요 : ");
        double num = sc.nextInt();
        int originNum = (int) num;
        int i = 0;

        for (i = 0; num >= 1; i++) {

            if (num >= 1) {

                num /= 10;
            }
        }

        System.out.println("입력하신 " + originNum + "은 " + i + "자릿수 입니다.");
    }
}
