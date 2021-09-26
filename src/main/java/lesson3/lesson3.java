package lesson3;

import java.util.Arrays;

public class lesson3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        int[] table = task5(7, 9);
        System.out.println(Arrays.toString(table));
    }

    private static void task1() {
        int[] arr = {0, 1, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else arr[i] = 1;

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task2() {
        int l = 100;
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = i + 1;

        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task4() {
        int l = 6;
        int[][] table = new int[l][l];
        for (int i = 0; i < l; i++) {
            table[i][i] = 1;
            table[i][l - 1 - i] = 1;
        }
        for (int j = 0; j < l; j++) {
            System.out.println(Arrays.toString(table[j]));
        }
    }

    private static int[] task5 (int len, int initialValue) {
        int[] table = new int[len];
        for (int i = 0; i < len; i++) {
            table[i] = initialValue;

        }

        return table;
    }

}
