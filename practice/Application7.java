package com.ohgiraffers.practice;

import com.ohgiraffers.answer.kang.Q240202.Application;

import java.util.Scanner;

public class Application7 {

    public static void main(String[] args) {

        /*
        마방진(magic square)이란 가로, 세로, 대각선의 합이 같은 사각형을 말한다.
        홀수 n을 입력으로 받아 n*n 홀수 마방진을 만들어 보자.
        만드는 방법은 여러가지 방법이 있지만, 아래와 같은 방법을 이용하여 구현해보자.
        구현 방법:
        1. 시작은 첫 행, 한 가운데 열에 1을 둔다.
        2. 행을 감소, 열을 증가하면서 순차적으로 수를 넣어간다.
        3. 행은 감소하므로 첫 행보다 작아지는 경우에는 마지막 행으로 넘어간다.
        4. 열은 증가하므로 마지막 열보다 커지는 경우에는 첫 열로 넘어간다.
        5. 넣은 수가 n의 배수이면 행만 증가한다. 열은 변화없음.
         */

        Application7 ap = new Application7();
        ap.mageSquare();
    }

    public void mageSquare() {

        System.out.print("임의의 홀수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        int i = 0;
        int j = (n - 1) / 2;
        int num = 1;

        while (num <= n * n) {


            arr[i][j] = num;

            if (num % n != 0) {

                i--;
                j++;

                if (i < 0) {

                    i = n - 1;

                } else if (j >= n) {

                    j = 0;

                }

            } else if (num % n == 0) {

                i++;
            }

            num++;
        }

        for (int x = 0; x < arr.length; x++) {

            for (int y = 0; y < arr[x].length; y++) {

                if (arr[x][y] < 10) {
                    System.out.print(" ");
                }
                System.out.print(arr[x][y] + " ");
            }

            System.out.println();

        }
    }
}
