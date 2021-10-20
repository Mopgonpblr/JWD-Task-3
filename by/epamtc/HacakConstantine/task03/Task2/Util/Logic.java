package by.epamtc.HacakConstantine.task03.Task2.Util;

import by.epamtc.HacakConstantine.task03.Task2.Util.Sorting.*;

public class Logic {

    public static void swap(int[][] arr, int i, int j) {
        int[] temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int sumOfElements(int[] arr) {
        int a = 0;
        for (int b : arr) {
            a += b;
        }
        return a;
    }

    public static int findMinMax(int[] arr, Find f) {
        int minMax = arr[0];
        for (int a : arr) {
            minMax = f.find(a, minMax);
        }
        return minMax;
    }

    public static void sort(int[][] arr, Direction d, Condition cond) {
        int a, b;
        for (int i = 0; i < arr.length - 1; ) {
            a = cond.process(arr[i]);
            b = cond.process(arr[i + 1]);
            i = d.process(arr, a, b, i);
        }
    }
}
