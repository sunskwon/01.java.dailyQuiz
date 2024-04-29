package com.ohgiraffers;

import java.util.Stack;

public class DFS {

    public static void main(String[] args) {

        int[][] arr = new int[12][12];

        arr[0] = new int[]{0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0};
        arr[1] = new int[]{1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0};
        arr[2] = new int[]{0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        arr[3] = new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        arr[4] = new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        arr[5] = new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        arr[6] = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        arr[7] = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1};
        arr[8] = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0};
        arr[9] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
        arr[10] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
        arr[11] = new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};

//        for (int[] row : arr) {
//            for (int item : row) {
//                System.out.print(item + " ");
//            }
//            System.out.println();
//        }

        boolean[] arr2 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false};

        int arrLength = arr.length;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        while (!stack.isEmpty()) {

            int stage = stack.pop();
            arr2[stage] = true;
            System.out.println(stage + 1);

            for (int i = arrLength - 1; i >= 0; i--) {
                if (arr[stage][i] == 1 && !arr2[i]) {
                    stack.push(i);
                    arr2[i] = true;
                }
            }
        }
    }
}
