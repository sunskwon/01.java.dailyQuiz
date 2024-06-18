package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
        피보나치 수열이란 앞의 두 수를 더하여 나오는 수열이다.
        첫 번째 수와 두 번째 수는 모두 1이고, 세 번째 수부터는 이전의 두 수를 더하여 나타낸다. 피보나치 수열을 나열해 보면 다음과 같다.
        1, 1, 2, 3, 5, 8, 13 …
        자연수 N을 입력받아 N번째 피보나치 수를 출력하는 프로그램을 작성하시오.
        ※ 이 문제는 반드시 재귀함수를 이용하여 작성 해야한다.

        입력
        자연수 N이 입력된다. (N은 20보다 같거나 작다.)

        출력
        N번째 피보나치 수를 출력한다.

        입력 예시
        7

        출력 예시
        13
        */

        Application6 ap = new Application6();
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수 n : ");
        int n = sc.nextInt();

        System.out.println(ap.rec(n));
    }

    public int rec(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else if (i > 2) {
            return rec(i - 1) + rec(i - 2);
        } else {
            return 0;
        }
    }
}
