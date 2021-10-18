package by.epamtc.HacakConstantine.task03.Task2.Util;

public class Logic {
    static int a;
    static int b;

    public static int[][] sort(int[][] array, String condition, String condi) {
        for (int i = 0; i < array.length - 1; ) {
            switch (condition) {
                case "SUM":
                    a = sumOfElements(array[i]);
                    b = sumOfElements(array[i + 1]);
                    break;
                case "MAX":
                    a = findMinMax(array[i], "MAX");
                    b = findMinMax(array[i+1], "MAX");
            }

            if (i==0) {
                int[] temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            } else
                i++;
        }
        return array;
    }

    public static int sumOfElements(int[] array) {
        int a = 0;
        for (int b : array) {
            a += b;
        }
        return a;
    }

    public static int findMinMax(int[] array, String condition) {
        int minMax = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            switch (condition) {
                case "MAX":
                    if (isMore(array[i], array[i + 1]))
                        minMax = a;
                    break;
                case "MIN":
                    if (isLess(array[i], array[i + 1]))
                        minMax = a;
                    break;
                default: return 0;
            }
        }
        return minMax;
    }

    public static boolean isLess(int a, int b) {
        return a < b;
    }

    public static boolean isMore(int a, int b) {
        return a > b;
    }
}
