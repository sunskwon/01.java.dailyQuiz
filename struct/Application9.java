package com.ohgiraffers.struct;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Application9 {

    public static void main(String[] args) {

        /*
        정렬되지 않은 학생들의 임의의 점수를 입력하여 석차를 계산하는 프로그램을 작성하시오.
        점수는 동점이 있을 수 있으며, 이러한 경우 같은 석차로 처리한다.
        예를 들어 5명의 점수 100, 90, 76, 60, 90이 입력되었다면 석차는 2등이 2명이고 3등은 없다.
        (단, 점수가 가장 높은 학생을 1등으로 한다.)

        입력
        1) 첫 번째 줄은 처리할 점수의 개수 n ( n <= 200 ) ※ 조건수정:2012.10.6
        2) 두 번째 줄은 처리할 점수 데이터 (0~100점)
        (단, 각각의 점수는 빈칸으로 구별한다.)

        출력
        석차를 계산한 후 점수와 석차를  출력한다

        입력 예시
        10
        60 34 55 100 90 76 60 90 80 87

        출력 예시
        60 7
        34 10
        55 9
        100 1
        90 2
        76 6
        60 7
        90 2
        80 5
        87 4
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("처리할 점수의 갯수 : ");
        int n = sc.nextInt();
        Integer[] data = new Integer[n];

        System.out.print("처리할 점수 데이터 : ");
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }

        Integer[] rank = data.clone();
        Arrays.sort(rank, Comparator.reverseOrder());

        for (Integer i : data) {
            System.out.println(i + " " + (Arrays.asList(rank).indexOf(i) + 1));
        }
    }
}

