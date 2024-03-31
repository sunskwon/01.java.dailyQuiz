package com.ohgiraffers.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application22 {

    public static void main(String[] args) {

        /*
        학생의 번호와 수학, 정보 점수를 가진 데이터가 있다.
        우리는 이를 정렬하려고 한다.
        정렬 기준은 수학점수가 높은 순으로 정렬하되, 수학점수가 같으면 정보점수가 높은 순, 정보점수도 같으면 번호가 빠른 순서로 정렬하려고 한다.

        입력
        첫째 줄에 학생수 n(번호:1~n)가 입력된다. (1 <= n <= 1,000)
        둘째 줄부터 각 줄에 수학점수, 정보점수가 입력된다. (번호는 1번 부터 ~ n번 차례대로 데이터가 입력됨)

        출력
        정렬된 데이터를 번호, 수학, 정보 점수 순으로 각 줄에 하나씩 출력한다.

        입력 예시
        5
        100 90
        90 100
        80 80
        80 90
        60 50

        출력 예시
        1 100 90
        2 90 100
        4 80 90
        3 80 80
        5 60 50
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int num = sc.nextInt();

        int[][] arr = new int[num][3];

        System.out.println("수학 정보 점수를 입력하세요 :");
        for (int i = 0; i < num; i++) {
            arr[i][0] = i + 1;
            for (int j = 1; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i][1] < arr[j][1]) {
                    for (int n = 0; n < 3; n++) {
                        int temp = arr[i][n];
                        arr[i][n] = arr[j][n];
                        arr[j][n] = temp;
                    }
                } else if (arr[i][1] == arr[j][1] && arr[i][2] < arr[j][2]) {
                    for (int n = 0; n < 3; n++) {
                        int temp = arr[i][n];
                        arr[i][n] = arr[j][n];
                        arr[j][n] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
