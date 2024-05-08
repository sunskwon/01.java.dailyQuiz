package com.ohgiraffers.struct;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
        진짜 오랜만에 주현이 엄마는 기억력 테스트를 하기로 했다.
        주현이가 많이 컸기 때문에 이제 숫자만 가지고 테스트하기엔 부족하다.
        이번에도 N 개의 숫자를 불러주고, M 개의 질문을 한다.
        처음에 [단어]와 [숫자]를 불러주고, 질문으로 [단어]를 물어보면 해당 단어의 [숫자]를 말하는 것이다.
        그런데 불러 줄 때 같은 [단어]가 나오는 경우 [이전 단어]의 [숫자]에 [현재 숫자]를 더해야 한다.
        예를 들어 "ddobot 3" , "poketmon 5", "ddobot 7"을 불러 주고, 질문으로 "ddobot"을 물었을 경우
        3 + 7 인 10을 답해야 한다.
        이번에는 포켓몬 썬&문  카드 풀 팩이 걸려 있다. 주현이가 잘 할 수 있도록 도와주자.

        입력
        첫째 줄에 N 과 M 이 입력된다.(1 <= N, M <= 100,000)
        둘째 줄부터 N 줄 동안 문자열 S 와 정수 k 가 입력된다.
        그 다음 M 줄 동안 질문 Q 가 문자열로 입력된다. 만약 부르지 않았던 단어를 질문하는 경우 0 을 출력한다.
        (S, Q 는 100글자 이하 영어 소문자 알파벳으로만 구성, k 는 10 이하의 자연수)

        출력
        질문에 맞는 [누적 숫자]를 한줄에 하나씩 출력한다.

        입력 예시
        3 4
        ddobot 3
        poketmon 5
        ddobot 7
        ddobot
        poketmon
        ddobot
        hellocarbot

        출력 예시
        10
        5
        10
        0
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자의 개수 : ");
        int n = sc.nextInt();

        System.out.print("질문의 개수 : ");
        int m = sc.nextInt();

        Map<String, Integer> memory = new HashMap<>();
        System.out.println("단어와 숫자 : ");
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            System.out.println("input = " + input);
            String[] answer = input.split(" ");
            System.out.println("answer = " + answer[0]);
            System.out.println("answer = " + answer[1]);

            if (memory.get(answer[0]) == null) {
                System.out.println("put");
                memory.put(answer[0], Integer.parseInt(answer[1]));
            } else {
                System.out.println("replace");
                int temp = memory.get(answer[0]);
                memory.replace(answer[0], Integer.parseInt(answer[1]) + temp);
            }
        }

        String[] answer = new String[m];
        System.out.println("질문 : ");

        for (int i = 0; i < m; i++) {
            answer[i] = sc.nextLine();
        }

        for (String response : answer) {
            if (memory.get(response) == null) {
                System.out.println(0);
            } else {
                System.out.println(memory.get(response));
            }
        }
    }
}
