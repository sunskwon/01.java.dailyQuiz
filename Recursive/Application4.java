package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        정수 n이 입력으로 들어오면 1부터 n까지의 합을 구하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

        입력
        입력으로 자연수 n이 입력된다.
        (1 <= n <= 10,000)

        출력
        1 부터 n까지의 합을 출력한다.

        입력 예시
        100

        출력 예시
        5050
        */

        Application4 ap = new Application4();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 n : ");
        int n = sc.nextInt();

        System.out.println(ap.rec(n));
    }

    public int rec(int i) {

        if (i == 1) {
            return 1;
        } else {
            return i + rec(i - 1);
        }
    }
}
