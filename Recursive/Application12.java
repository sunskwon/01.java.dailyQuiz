package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application12 {

    public static void main(String[] args) {

        /*
        n이 입력되면 다음과 같은 삼각형을 출력하시오.
        예)
        n 이 5 이면
        *
        **
        ***
        ****
        *****
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.
        금지 키워드 : for while goto

        입력
        길이 n이 입력된다.(1 <= n <= 150)

        출력
        삼각형을 출력한다.

        입력 예시
        3

        출력 예시
        *
        **
        ***
        */

        Application12 ap = new Application12();
        Scanner sc = new Scanner(System.in);

        System.out.print("길이 n : ");
        int n = sc.nextInt();

        ap.rec(n);
    }

    public void rec(int i) {

        if (i != 1) {

            rec(i - 1);
            rep(i);
        } else {
            System.out.print("*");
        }

        System.out.println();
    }

    public void rep(int i) {

        if (i != 0) {

            System.out.print("*");

            rep(i - 1);
        }
    }
}
