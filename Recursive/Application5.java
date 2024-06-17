package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        팩토리얼(!)은 다음과 같이 정의된다.
        n! = n × (n − 1) × (n − 2) × ⋯ × 2 × 1
        즉, 5! = 5 × 4 × 3 × 2 × 1 = 120 이다.

        n이 입력되면 n!의 값을 출력하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

        입력
        자연수 n이 입력된다.(n <= 12)

        출력
        n!의 값을 출력한다.

        입력 예시
        5

        출력 예시
        120
        */

        Application5 ap = new Application5();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 n : ");
        int n = sc.nextInt();

        System.out.println(ap.rec(n));
    }

    public int rec(int i) {
        if (i >= 1) {
            return i * rec(i - 1);
        } else {
            return 1;
        }
    }
}
