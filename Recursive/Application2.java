package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
        정수 n 부터 1까지 출력하는 재귀함수를 설계하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

        입력
        정수 n이 입력된다(1 <= n <= 200)

        출력
        n부터 1까지 한 줄에 하나씩 출력한다.

        입력
        10

        출력
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1
        */

        Application2 ap = new Application2();
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 n : ");
        int n = sc.nextInt();

        ap.rec(n);
    }

    public void rec(int i) {
        if (i >= 1) {
            System.out.println(i);
            rec(i - 1);
        }
    }
}
