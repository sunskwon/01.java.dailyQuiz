package com.ohgiraffers.struct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        순서없이 적힌 스케줄 메모가 있다.
        메모는 스케줄명, 연, 월, 일 의 형태로 구성되어 있다.
        이 메모를 토대로 날짜가 빠른 순서로 정렬하여 출력하고자 한다.
        만약 날짜가 동일한 경우 스케줄명의 사전식 순서로 오름차순 정렬한다.

        입력
        첫째줄에 데이터의 개수 n이 입력된다.(1<=n<=100)
        그 다음줄부터 n개의 데이터가 스케줄명, 년, 월, 일 형태로 한 줄에 하나씩 입력된다. 스케줄명은 공백없이 알파벳소문자 99글자 이하, 년월일은 유효한 날짜만 입력된다.
        출력 가장 먼저 해야 할 스케줄명부터 정렬하여  출력한다.

        입력 예시
        5
        sleep 2014 05 23
        golf 2014 06 02
        travel 2015 11 22
        baseball 2013 02 01
        study 2014 05 23

        출력 예시
        baseball
        sleep
        study
        golf
        travel
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("데이터의 개수 : ");
        int n = sc.nextInt();

        System.out.println("데이터 : ");
        sc.nextLine();
        ArrayList<Struct5> arr = new ArrayList();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] answer = input.split(" ");

            arr.add(new Struct5(answer[0], Integer.parseInt(answer[1]), Integer.parseInt(answer[2]), Integer.parseInt(answer[3])));
        }

        Collections.sort(arr);

        for (Struct5 schedule : arr) {
            System.out.println(schedule.getSchedule());
        }
    }
}
