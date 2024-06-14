package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        시작수(a)와 마지막 수(b)가 입력되면
        a부터 b까지의 모든 홀수를 출력하시오.
        이 문제는 반복문 for, while 등을 이용하여 풀수 없습니다.

        입력
        두 수 a, b 가 입력된다. (1 <= a <= b <= 100)

        출력
        a~b의 홀수를 모두 출력한다.

        입력 예시
        2 7
        출력 예시
        3 5 7
        */

        Application3 ap = new Application3();
        Scanner sc = new Scanner(System.in);

        System.out.print("시작수와 마지막 수 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        ap.rec(a, b);
    }

    public void rec(int a, int b) {

        if (b >= a) {
            if (a % 2 == 0) {
                rec(a + 1, b);
            } else {
                System.out.print(a + " ");
                rec(a + 2, b);
            }
        }
    }
}
