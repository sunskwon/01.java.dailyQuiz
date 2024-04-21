package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application31 {

    public static void main(String[] args) {

        /*
        시작 수(a)와 마지막 수(b)가 입력되면 그 범위의 369게임에서 박수를 쳐야 될 횟수의 합을 출력하시오.
        ※ 369게임의 룰은 다음과 같다.
        1. 숫자에 3이나 6이나 9가 들어가면 369 수에 해당된다.
        2. 369 수에 해당될 경우 3이나 6이나 9가 들어간 개수만큼 박수를 친다. (예: 36은 박수를 두번 친다.)
        3. 그 외의 숫자들은 박수를 치지 않는다.
        아주 큰 범위의 테스트 데이터가 입력된다.

        입력
        시작 수 a와 마지막 수 b가 공백을 기준으로 입력된다.
        (1 <= a <= b <= 100,000,000)

        출력
        범위에서 박수를 친 횟수를 출력한다.

        입력 예시
        3 16

        출력 예시
        5
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("시작 수와 마지막 수 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for(int i = a; i <= b; i++) {

            int temp = i;

            while(temp > 0) {

                if(temp % 10 != 0 && temp % 10 % 3 == 0) {
                    count++;
                }

                temp /= 10;
            }
        }

        System.out.println(count);
    }
}
