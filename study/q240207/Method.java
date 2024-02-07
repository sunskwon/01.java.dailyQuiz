package com.ohgiraffers.study.q240207;

public class Method {

    public String[] stringToArray(String str) {

        int numOf = (str.length() + 1) / 4;
        String[] arr = new String[numOf];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = str.substring((i * 4), (i * 4) + 3);
        }

        return arr;
    }

    public int findKim(String[] arr) {

        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].charAt(0) == '김') {

                num++;
            }
        }

        return num;
    }

    public int findLee(String[] arr) {

        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].charAt(0) == '이') {

                num++;
            }
        }

        return num;
    }

    public int findLeeJaeYoung(String[] arr) {

        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("이재영")) {

                num++;
            }
        }

        return num;
    }

    public String[] dupRemove(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j].equals(arr[i])) {

                    arr[j] = "";
                }
            }
        }

        String str = (String) arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].equals("")) {

                continue;
            }

            str += ("," + (String) arr[i]);
        }

        Method method = new Method();

        return method.stringToArray(str);
    }

    public void printArr(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }
    }

    public String[] ascenArr(String[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if ((int) (arr[i].charAt(0)) == (int) (arr[j].charAt(0))) {

                    if ((int) (arr[i].charAt(1)) > (int) (arr[j].charAt(1))) {

                        String temp;
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else if ((int) (arr[i].charAt(0)) > (int) (arr[j].charAt(0))) {

                    String temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
