package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application26 {

    public int max = 0;

    public static void main(String[] args) {

        /*
        정보 선생님은 예산이 많은 부서에서 일하고 있다.
        학기말이 가까워지면서 부서의 예산을 가급적 모두 집행해야 될 상황이 되었다.
        정보 선생님은 예산 범위를 넘지 않는 범위 내에서 다양한 활동을 하고 싶어한다.
        지금 남은 예산(B)이 40이고(단위:만원), 예산을 사용할 수 있는 활동(N)이 6개가 있다.
        6개의 활동에 각각 드는 비용은 7, 13, 17, 19, 29, 31이다.
        여기서 40을 채울 수 있는 활동의 개수는 상관이 없다.
        40을 넘지 않는 범위에서 활동 비용을 조합해보면,
        7 + 13 + 17 = 37
        7 + 31 = 38
        7 + 13 + 19 = 39
        ...
        따라서 40을 초과하지 않으면서 예산을 최대로 사용할 수 있는 비용은 39이다.
        정보 선생님을 도와 줄 수 있는 프로그램을 작성하시오.

        입력
        첫째 줄에 남은 예산(B)가 입력된다. ( 10 <= B <= 35,000 )
        둘째 줄에 예산을 사용할 수 있는 활동의 수(N)이 입력된다. (1 <= N <= 21 )
        셋째 줄에 공백을 기준으로 N개의 활동비가 양의 정수로 입력된다.

        출력
        남은 예산을 초과하지 않으면서 최대로 사용할 수 있는 비용액을 출력하시오.

        입력 예시
        40
        6
        7 13 17 19 29 31

        출력 예시
        39
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("남은 예산 : ");
        int b = sc.nextInt();

        System.out.print("활동의 수 : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("활동비 : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Application26 ap = new Application26();
        ap.permutation(arr, 0, b);

        System.out.println(ap.max);
    }

    public void permutation(int[] arr, int start, int b) {

        if (start == arr.length - 1) {

            int temp = 0;

            for (int i = 0; i < arr.length; i++) {
                if (temp + arr[i] <= b) {
                    temp += arr[i];
                } else {
                    if (max < temp) {
                        max = temp;
                    }
                }
            }
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permutation(arr, start + 1, b);
                swap(arr, start, i);
            }
        }
    }

    public int[] swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }
}
