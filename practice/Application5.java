package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /* 별 모양 도형 출력하기에 재미를 붙인 철수는 이번에는 조금 어려운 빗금 친 사각형을 만들어 보기로 했다.
        n ∗ n 사각형에서 k간격 마다 빗금을 친 사각형을 출력하는 프로그램을 작성하시오.
        예를 들어, n=10, k=3이면,
        **********
        **  *  * *
        *  *  *  *
        * *  *  **
        **  *  * *
        *  *  *  *
        * *  *  **
        **  *  * *
        *  *  *  *
        **********
        윗변을 기준으로 왼쪽에서 부터 k간격마다 ↙방향으로 빗금을 그으시오.
        10 3인경우,
        **********
          |  |  |
        이 위치들(즉, 3의 배수)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("사각형의 크기를 입력해주세요 : ");
        int n = sc.nextInt();
        System.out.print("간격을 입력해주세요 : ");
        int k = sc.nextInt();

        System.out.println("n = " + n);
        System.out.println("k = " + k);

        String[][] arr = new String[n][n];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {

                    arr[i][j] = "*";
                } else if ((i + j) % k == 2) {

                    arr[i][j] = "*";

                } else {

                    arr[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]);

            }

            System.out.println();

        }
    }
}
