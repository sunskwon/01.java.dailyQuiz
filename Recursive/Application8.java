package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
        어떤 10진수 n이 주어지면 2진수로 변환해서 출력하시오.
        예)
        10    ----->  1010
        0    ----->  0
        1    ----->  1
        2    ----->  10
        1024    ----->  10000000000
        이 문제는 반복문을 이용하여 풀 수 없습니다.
        금지 키워드 : for while goto

        입력
        10 진수 정수 n이 입력된다.
        (0 <= n <= 2,100,000,000)

        출력
        2진수로 변환해서 출력한다.

        입력 예시
        7

        출력 예시 111
        */

        Application8 ap = new Application8();
        Scanner sc = new Scanner(System.in);

        System.out.print("10진수 정수 n : ");
        int n = sc.nextInt();

        ap.rec(n);
    }

    public void rec(int n) {

        if (n == 0) {
            System.out.print(0);
        } else if (n == 1) {
            System.out.print(1);
        } else {

            rec(n / 2);

            System.out.print(n % 2);
        }
    }
}
