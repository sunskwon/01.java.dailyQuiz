package com.ohgiraffers.struct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        세종이는 정보과학 선생님인 JH를 도와주기 위해 정보과학 성적처리 프로그램을 만들기로 했다.
        JH 선생님은 특정 과목에서 1등한 학생이 다른 과목에서는 어떤 성적을 얻었는지 관심이 많다.
        다음 조건을 만족하는 프로그램을 작성해 보자.

        입력
        첫째 줄에 데이터의 개수 n (3 <= n <= 100)
        둘째 줄부터 n + 1줄에 학생 이름과 3 과목 점수들이 공백으로 구분되어 입력된다. (입력 예시 참고)
        단 이름의 길이는 최대 10바이트 이내이다

        출력
        첫 번째 과목을 1등한 학생의 이름과 두 번째, 세 번째 과목의 석차를 공백으로 구분하여 출력한다.
        단 첫 번째 과목의 1등은 1명이라고 가정한다.

        입력 예시
        4
        Jeon 95 80 100
        Kim 59 85 75
        Lee 90 100 75
        Bae 100 82 80

        출력 예시
        Bae 3 2
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("데이터의 개수 : ");
        int n = sc.nextInt();

        System.out.println("이름과 점수 : ");
        sc.nextLine();
        ArrayList<Struct4> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String response = sc.nextLine();
            String[] answer = response.split(" ");

            arr.add(new Struct4(answer[0], Integer.parseInt(answer[1]), Integer.parseInt(answer[2]), Integer.parseInt(answer[3])));
        }

        Collections.sort(arr);

        String[] name = new String[arr.size()];
        int[] score2 = new int[arr.size()];
        int[] score3 = new int[arr.size()];

        int index = 0;
        for (Struct4 item : arr) {
            name[index] = item.getName();
            score2[index] = item.getScore2();
            score3[index] = item.getScore3();
            index++;
        }

        int order2 = 1;
        int order3 = 1;

        for (int i = 1; i < n; i++) {
            if (score2[0] < score2[i]) {
                order2++;
            }
            if (score3[0] < score3[i]) {
                order3++;
            }
        }

        System.out.println(name[0] + " " + order2 + " " + order3);
    }
}
