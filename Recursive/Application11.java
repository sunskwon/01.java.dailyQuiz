package com.ohgiraffers.Recursive;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
        SuperSum 함수는 다음과 같이 정의된다.
            SuperSum(0, n) = n (n은 모든 양의 정수)

        SuperSum(k, n) = SuperSum(k - 1, 1) + SuperSum(k - 1, 2) + ... + SuperSum(k - 1, n)
        k와 n이 여러개 주어진다. SuperSum의 값을 각각 출력하시오.

        입력
        k(1 <= k <= 14)와
        n(1 <= n <= 14)이 입력된다.

        출력
        SuperSum(k, n)의 값을 각 행에 하나씩 출력한다.

        입력 예시
        1 3
        2 3
        4 10
        10 10

        출력 예시
        6
        10
        2002
        167960
        */

        Application11 ap = new Application11();
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 k와 n : ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(ap.rec(k, n));
    }

    public int rec(int k, int n) {

        int sum = 0;

        if (k == 0) {

            sum = n;
        } else {

            for (int i = 1; i <= n; i++) {

                sum += rec(k - 1, i);
            }
        }

        return sum;
    }
}
