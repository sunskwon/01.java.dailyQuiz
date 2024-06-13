package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /*
        1 부터 정수 n까지 출력하는 재귀함수를 설계하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

        입력
        정수 n이 입력된다(1 <= n <= 200)

        출력
        1부터 n까지 한 줄에 하나씩 출력한다.

        입력 예시
        10

        출력 예시
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n : ");
        int n = sc.nextInt();

        Application1 ap = new Application1();
        ap.rec(n);
    }

    public void rec(int n) {

        if (n != 1) {
            rec(n - 1);
        }

        System.out.println(n);
    }
}
