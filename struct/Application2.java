package com.ohgiraffers.struct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /*
        프로그래밍 문제를 풀다 보면 뒤죽박죽인 N개의 데이터를 숫자의 크기 순으로 0 ~ N-1까지의 숫자로 재정렬 해야되는 경우가 종종 있다.
        예를 들어 N=5 이고,
        50 23 54 24 123
        이라는 데이터가 있다면,
        2 0 3 1 4
        가 된다.
        데이터를 재정렬하는 프로그램을 작성하시오.

        입력
        첫째 줄에 데이터의 개수 N이 입력된다. ( 1 <= N <= 50,000)
        둘째 줄에 공백으로 분리되어 N개의 서로 다른 데이터가 입력된다. (값의 범위:0~500,000)

        출력
        N개의 데이터를 0 ~ N-1로 재정렬하여 출력하라.

        입력 예시
        5
        50 23 54 24 123

        출력 예시
        2 0 3 1 4
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("데이터의 개수 : ");
        int n = sc.nextInt();

        System.out.print("데이터 : ");
        ArrayList<Struct2> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            arr.add(new Struct2(i, sc.nextInt()));
        }

        Collections.sort(arr);

        int[] result = new int[n];

        int i = 0;
        for (Struct2 item : arr) {
            result[item.getOrder()] = i++;
        }

        for (int item : result) {
            System.out.print(item + " ");
        }
    }
}
