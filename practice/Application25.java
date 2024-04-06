package com.ohgiraffers.practice;

import java.util.Scanner;
import java.util.Stack;

public class Application25 {

    public static void main(String[] args) {

        /*
        농부 존의 N마리의 소들이 있다.
        소들은 헤어스타일에 예민하기 때문에, 다른 소들의 헤어 스타일을 보고 싶어한다.
        i번째 소들의 키가 hi이고, 모든 소들은 일렬로 서 있고 오른쪽으로만 볼 수 있다.
        i번째 소가 볼 수 있는 다른 소의 헤어 스타일은 i+1, i+2, .... 이다.
        그런데 자기 보다 키가 같거나 큰 소가 있으면 그 다음에 있는 모든 소들의 헤어스타일은 보지 못한다.
        예) N=6, H = { 10, 3, 7, 4, 12, 2 }인 경우
                  =
         =        =
         =   -    =
         =   =    =        -> 소가 보는 방향
         = - = =  =
         = = = =  = =
        10 3 7 4 12 2
        1번소는 2, 3, 4소의 머리스타일을 확인할 수 있다.
        2번소는 다른 소들의 머리스타일을 확인할 수 없다.
        3번소는 4번소의 머리스타일을 확인할 수 있다.
        4번소는 다른 소의 머리스타일을 확인할 수 없다.
        5번소는 6번소의 머리스타일을 확인할 수 있다.
        6번소는 마지막이므로 다른 소의 머리스타일을 확인할 수 없다.
        따라서, 머리스타일을 확인할 수 있는 총 수는 3 + 0 + 1 + 0 + 1 + 0 = 5이다.

        입력
        첫번째 줄에 소의 수 N이 입력된다.(1 <= N <= 80,000)
        두 번째 줄 부터 N+1번째 줄까지 각 소들의 키가 입력된다. ( 1 <= hi <= 1,000,000,000 )

        출력
        각 소들이 헤어 스타일을 확인할 수 있는 소들의 수를 출력한다.

        입력 예시
        6
        10
        3
        7
        4
        12
        2

        출력 예시
        5
        */

        Scanner sc = new Scanner(System.in);

        System.out.print("소의 수 : ");
        int num = sc.nextInt();

        System.out.println("소들의 키 : ");
        int[] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (height[i] > height[j]) {
                    count++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
