package com.ohgiraffers.quiz;

import java.util.Random;

public class Q240131 {

    public static void main(String[] args) {

        /*
        0부터 9까지의 임의의 정수 3개를 생성하고
        1. 생성된 숫자들이 모두 다르다면 오름차순으로 정렬해서 출력,
        2. 생성된 숫자들 중 중복되는 숫자가 있다면 다시 실행하라고 출력하는 코드를 만드세요.

        ----- 출력 예시 -----
        예 1) 생성된 숫자들은 1, 3, 5 입니다.
        예 2) 중복되는 숫자가 생성되었습니다. 다시 시도해 주십시오
         */

        Q240131 a = new Q240131();

        int num1 = a.randomGen();
        int num2 = a.randomGen();
        int num3 = a.randomGen();

        if ((num1 != num2) && (num1 != num3) && (num2 != num3)) {

            int min = a.minValue(num1, num2, num3);
            int mid = a.midValue(num1, num2, num3);
            int max = a.maxValue(num1, num2, num3);

            System.out.println("생성된 숫자들은 " + min + ", " + mid + ", " + max + " 입니다.");
        } else {

            System.out.println("중복되는 숫자가 생성되었습니다. 다시 시도해 주십시오");
        }

    }

    public int randomGen() {

        Random ran = new Random();

        int num = ran.nextInt(10);

        return num;
    }

    public int minValue(int num1, int num2, int num3) {

        int comp2 = (num1 > num2) ? num2 : num1;

        int minVal = (comp2 > num3) ? num3 : comp2;

        return minVal;
    }

    public int midValue(int num1, int num2, int num3) {

        int maxVal;
        int midVal;
        int minVal;

        int comp1 = (num1 > num2) ? num1 : num2;
        int comp2 = (num1 > num2) ? num2 : num1;

        maxVal = (comp1 > num3) ? comp1 : num3;
        minVal = (comp2 > num3) ? num3 : comp2;

        if (num1 != maxVal && num1 != minVal) {

            midVal = num1;
        } else if (num2 != maxVal && num2 != minVal) {

            midVal = num2;
        } else {

            midVal = num3;
        }

        return midVal;
    }

    public int maxValue(int num1, int num2, int num3) {

        int comp1 = (num1 > num2) ? num1 : num2;

        int maxVal = (comp1 > num3) ? comp1 : num3;

        return maxVal;

    }
}
