package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application28 {

    public static void main(String[] args) {

        /*
        파스칼 삼각형이란 다음과 같은 규칙성을 가지고 있다.
        n = 5일때,
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        규칙은 자세히 보면 찾아낼 수 있을 것이다.
        파스칼 삼각형 n번째 행까지 출력하여라.

        입력
        첫째 줄에 정수n이입력된다.(1 <= n <= 50)

        출력
        n행의 파스칼 삼각형을 출력한다.

        입력 예시
        5

        출력 예시
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("행의 갯수 : ");
        int n = sc.nextInt();
        int[][] pascalsTriangle = new int[n][];

        for (int i = 0; i < n; i++) {
            pascalsTriangle[i] = new int[i + 1];

            pascalsTriangle[i][0] = 1;
            pascalsTriangle[i][i] = 1;

            for (int j = 1; j < i; j++) {
                pascalsTriangle[i][j] = pascalsTriangle[i - 1][j - 1] + pascalsTriangle[i - 1][j];
            }
        }

        for (int i = 0; i < pascalsTriangle.length; i++) {
            for (int j = 0; j < pascalsTriangle[i].length; j++) {
                System.out.print(pascalsTriangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
