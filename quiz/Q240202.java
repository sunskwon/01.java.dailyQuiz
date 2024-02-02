package com.ohgiraffers.quiz;

public class Q240202 {

    public static void main(String[] args) {

        /* 1부터 45까지의 정수 중 임의의 서로 다른 숫자 6개가 '오름차순'으로 출력되도록 코드를 작성하세요

                       출력 예시
        생성된 숫자는 5, 7, 10, 14, 15, 20입니다.
         */

        Q240202 q = new Q240202();

        int[] arr = new int[6];
        arr = q.randomSixNumbers();

        arr = q.sort(arr);

        System.out.println("생성된 숫자는 " + arr[0] + ", " + arr[1] + ", " + arr[2] + ", " + arr[3] + ", " + arr[4] + ", " + arr[5] + "입니다.");
    }

    public int randomGen() {

        int num = (int) ((Math.random() * 45) + 1);

        return num;
    }

    public int[] randomSixNumbers() {

        int[] arr = new int[6];

        Q240202 q = new Q240202();
        arr[0] = q.randomGen();

        do {

            arr[1] = q.randomGen();
        } while (!(arr[0] != arr[1]));

        do {

            arr[2] = q.randomGen();
        } while (!((arr[0] != arr[2]) && (arr[1] != arr[2])));

        do {

            arr[3] = q.randomGen();
        } while (!((arr[0] != arr[3]) && (arr[1] != arr[3]) && (arr[2] != arr[3])));

        do {

            arr[4] = q.randomGen();
        } while (!((arr[0] != arr[4]) && (arr[1] != arr[4]) && (arr[2] != arr[4]) && (arr[3] != arr[4])));

        do {

            arr[5] = q.randomGen();
        } while (!((arr[0] != arr[5]) && (arr[1] != arr[5]) && (arr[2] != arr[5]) && (arr[3] != arr[5]) && (arr[4] != arr[5])));

        return arr;
    }

    public int[] sort(int[] arr) {

        int i = 0;
        int j = 0;

        for (i = 0; i < arr.length; i++) {

            for (j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = 0;

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
