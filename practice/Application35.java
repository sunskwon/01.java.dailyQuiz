package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application35 {

    public static void main(String[] args) {

        /*
        어떤 배낭에 W무게 만큼 물건을 담을 수 있다.
        물건들은 (무게 Wi, 가격 Vi) 정보를 가지고 있는데, 물건들을 조합해서 담아 가격의 총합이 최대가 되게 하려고 한다.
        물건들은 한 종류씩 밖에 없으며, 절대 배낭의 무게를 초과해서는 안 된다.

        입력
        첫째 줄에 물건의 개수 N(1<= N <= 100)과 배낭의 무게 W( 1 <= W <= 10000 )가 입력된다.
        둘째 줄부터 N+1째줄 까지 물건들의 정보가 wi, vi가 한 줄에 하나씩 입력된다. ( 1 <= Wi, Vi <= 100 )

        출력
        배낭의 무게 W를 초과하지 않으면서 물건의 가격의 총합의 최대값을 출력한다.

        입력 예시
        4 5
        2 3
        1 2
        3 3
        2 2

        출력 예시
        7
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("물건의 개수와 배낭의 무게 : ");
        int n = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[n][2];
        System.out.println("물건의 정보 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int max = 0;

        for (int i = 0; i < 1 << arr.length; i++) {

            int tempW = 0;
            int tempV = 0;

            for (int j = 0; j < arr.length; j++) {
                if ((i & 1 << j) != 0) {

                    if (tempW + arr[j][0] <= w) {
                        tempW += arr[j][0];
                        tempV += arr[j][1];

                        if (tempV > max) {

                            max = tempV;
                        }
                    }
                }
            }
        }

        System.out.println("max = " + max);
    }
}
