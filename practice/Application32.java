package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application32 {

    public static void main(String[] args) {

        /*
        콜라츠의 추측, 3n+1 문제, 우박수 문제라고 불리는 이 문제는 다음과 같다.

        1, 어떤 자연수 n이 입력되면,
        2. n이 홀수이면 3n+1을 하고,
        3. n이 짝수이면 n/2를 한다.
        4. 이 n이 1이 될때까지 2~3과정을 반복한다.

        예를 들어 5는 5 → 16 → 8 → 4 → 2 → 1 이 된다.
        여기서 5가 1이되기 위해 6개의 숫자를 나열하게 된다. 이것을 길이라고 하면 5의 길이는 6이된다.
        시작수와 마지막 수가 입력되면 그 두 사이게 길이가 가장긴 우박수와 그 길이를 출력하시오.

        입력
        두 자연수 a, b가 공백으로 분리되어 입력된다. ( 1 <= a <= b <= 10,000,000 )

        출력
        a에서 b사이에 길이가 가장긴 우박수와 그 길이를 출력한다. 만약 가장 긴 수가 두 개이상인 경우, 작은 숫자를 출력하시오.

        입력 예시
        1 10

        출력 예시
        9 20
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("두 자연수 : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {

            int tempNum = i;
            int tempCount = 1;

            while (!(tempNum == 1)) {

                if (tempNum % 2 == 1) {
                    tempNum = tempNum * 3 + 1;
                    tempCount++;
                } else if (tempNum % 2 == 0) {
                    tempNum /= 2;
                    tempCount++;
                }
            }

            if (tempCount > count) {

                num = i;
                count = tempCount;
            }
        }

        System.out.print(num + " ");
        System.out.print(count);
    }
}
