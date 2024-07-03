package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        /*
        피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
        첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.
        1, 1, 2, 3, 5, 8, 13…
        자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
        단, N이 커질 수 있으므로 출력값에 10,009를 나눈 나머지를 출력한다.
        ※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.
        금지 키워드 : while goto for

        입력
        자연수 N이 입력된다. (N은 200보다 같거나 작다.)

        출력
        N 번째 피보나치 수를 출력하되, 10,009를 나눈 나머지 값을 출력한다.

        입력 예시
        7

        출력 예시
        13
        */

        Application7 ap = new Application7();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 N : ");
        int n = sc.nextInt();

        int print = ap.rec(n) % 10009;

        System.out.println(print);
    }

    public int rec(int i) {

        if (i < 3) {
            return 1;
        } else {
            return rec(i - 1) + rec(i - 2);
        }
    }
}
