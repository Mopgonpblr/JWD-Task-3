package by.epamtc.HacakConstantine.task03.Task2.Util;


public class Logic {

    private static void swap(int[][] array, int i, int j) {
        int[] temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int sumOfElements(int[] array) {
        int a = 0;
        for (int b : array) {
            a += b;
        }
        return a;
    }

    public static int findMinMax(int[] array, Condition cond) {
        int minMax = array[0];
        for (int i = 0; i < array.length; i++) {
            switch (cond) {
                case MAX:
                    if (array[i] > minMax)
                        minMax = array[i];
                    break;
                case MIN:
                    if (array[i] < minMax)
                        minMax = array[i];
                    break;
                default:
                    return -1;
            }
        }
        return minMax;
    }

    public static int[][] sort(int[][] array, Direction dir, Condition cond) {
        boolean isError = false;
        int a = 0, b = 0;
        for (int i = 0; i < array.length - 1; ) {
            switch (cond) {
                case SUM:
                    a = sumOfElements(array[i]);
                    b = sumOfElements(array[i + 1]);
                    break;
                case MAX:
                    a = findMinMax(array[i], Condition.MAX);
                    b = findMinMax(array[i + 1], Condition.MAX);
                    break;
                case MIN:
                    a = findMinMax(array[i], Condition.MIN);
                    b = findMinMax(array[i + 1], Condition.MIN);
                    break;
                default:
                    isError = true;
                    break;
            }
            if (isError)
                return null;
            switch (dir) {
                case INCREASE:
                    if (a > b) {
                        swap(array, i, i + 1);
                        i = 0;
                    } else
                        i++;
                    break;
                case DECREASE:
                    if (a < b) {
                        swap(array, i, i + 1);
                        i = 0;
                    } else
                        i++;
                    break;
                default:
                    return null;

            }
        }
        return array;
    }
}
