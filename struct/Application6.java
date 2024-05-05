package com.ohgiraffers.struct;

import java.util.*;

public class Application6 {

    public static void main(String[] args) {

        /*
        세종이는 주말에 정보 과학실에서 정보 올림피아드 준비를 하려고 한다.
        JH 선생님은 정보 과학실 사용 조건으로 정보 올림피아드 참가 학생 명단을 작성하는 프로그램을 작성하라고 하셨다.
        짖굳은 JH 선생님은 입력 데이터를 만들 때 일부러 중간에 잘못된 값을 끼워 왕창 끼워 넣었다.
        그리고 잘못된 데이터를 제거하는 방법을 설명해 주었다.
        다음 조건에 따라 프로그램을 만들고 올바른 명단만 출력해 보자.

        입력
        첫째 줄에 입력 데이터의 개수 n 이 입력된다. (10 <= n <= 100)
        둘째 줄부터 n + 1 번째 줄까지 처리 코드 c (문자 1 자리), 수험 번호 no (1 <= no <= 10,000), 이름(10 바이트 이내)이 입력된다.
        처리 코드에 따라 입력 데이터를 메모리에 저장하거나 삭제해야 한다. 처리 코드가 'I'이면 데이터를 수험 번호 순서에 맞게 삽입한다.
        만약 입력할 때 이미 수험 번호가 입력되어 있다면 아무 작업도 하지 않는다.
        처리 코드가 ‘D’이면 메모리의 데이터 중에서 해당 수험 번호를 찾아 삭제한다.
        만약 처리 코드가 'D'이고 해당 수험 번호가 존재하지 않으면 아무 작업도 하지 않는다.
        마지막으로 n + 2번째 줄에 올바른 데이터의 위치를 나타내는 정수 5개가 입력된다.

        출력
        메모리에 저장된 데이터 중에서 올바른 데이터 위치에 있는 값의 명단을 출력한다.

        입력 예시
        10
        I 1011 한라산
        I 999 백두산
        I 999 오대산
        D 999 백두산
        I 800 백두산
        D 500 한라산
        I 900 남산
        I 950 금강산
        I 1205 지리산
        I 700 북한산
        1 2 4 5 6

        출력 예시
        700 북한산
        800 백두산
        950 금강산
        1011 한라산
        1205 지리산
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("데이터의 개수 : ");
        int n = sc.nextInt();

        System.out.println("처리코드, 수험 번호, 이름 : ");
        sc.nextLine();
        Map<Integer, String> arr = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] answer = input.split(" ");

//            System.out.println("answer[0] = " + answer[0]);
//            System.out.println(answer[0].equals("I"));

            if (answer[0].equals("I")) {
                arr.put(Integer.parseInt(answer[1]), answer[2]);
            } else if (answer[0].equals("D")) {
                arr.remove(Integer.parseInt(answer[1]));
            }
        }

//        System.out.println("arr = " + arr);

        System.out.print("데이터의 위치 : ");
        int[] index = new int[5];
        for (int i = 0; i < 5; i++) {
            index[i] = sc.nextInt();
        }

        Integer[] keys = arr.keySet().toArray(new Integer[arr.size()]);

        for (int order : index) {
            System.out.print(keys[order - 1] + " " + arr.get(keys[order - 1]));
            System.out.println();
        }
    }
}
