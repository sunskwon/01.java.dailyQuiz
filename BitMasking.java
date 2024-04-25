package com.ohgiraffers;

public class BitMasking {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < 1 << arr.length; i++) {
            if (Integer.bitCount(i) == 3) {
                for (int j = 0; j < arr.length; j++) {
                    if ((i & 1 << j) != 0) {
                        System.out.print(arr[j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
