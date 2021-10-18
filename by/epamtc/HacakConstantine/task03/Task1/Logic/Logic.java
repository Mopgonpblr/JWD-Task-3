package by.epamtc.HacakConstantine.task03.Task1.Logic;

import by.epamtc.HacakConstantine.task03.NewScanner;
import by.epamtc.HacakConstantine.task03.Task1.Model.Array;

import java.io.FileNotFoundException;
import java.util.Random;

public class Logic {
    public static int[] selectionSort(Array ar) {
        int[] array = ar.getValue();
        int min = 0;
        for (int j = 0; j < array.length; ) {
            for (int i = j; i < array.length; i++){
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
            j++;
            min = j;
        }
        return array;
    }

    public static void bubbleSort(Array ar) {
        int[] array = ar.getValue();
        for (int i = 0; i < array.length - 1; )
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                i = 0;
            } else
                i++;
    }

    public static int[] shellSort(Array ar) {
        int[] array = ar.getValue();
        for (int step = array.length / 2; step > 0; step /= 2)
            for (int i = step, j; i < array.length; i++) {
                int tmp = array[i];
                for (j = i; j >= step; j -= step) {
                    if (tmp < array[j - step])
                        array[j] = array[j - step];
                    else
                        break;
                }
                array[j] = tmp;
            }
        return array;
    }

    public static int binarySearch(Array ar, int key) {
        int[] array = ar.getValue().clone();
        int low = 0;
        int high = array.length;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -1;  // key not found.
    }

    public static int findMax(Array ar) {
        int[] array = ar.getValue();
        int max = array[0];
        for (int i : array)
            if (i > max)
                max = i;
        return max;
    }

    public static int findMin(Array ar) {
        int[] array = ar.getValue();
        int min = array[0];
        for (int i : array)
            if (i < min)
                min = i;
        return min;
    }

    public static String findSimpleNumbers(Array ar) {
        StringBuilder sb = new StringBuilder();
        int[] array = ar.getValue();
        for (int i = 0; ; i++) {
            boolean flag = false;
            for (int j = 2; j <= array[i] / 2; ++j) {
                if (array[i] % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sb.append(array[i]).append(" ");
            }
            if (i == array.length - 1) {
                break;
            }

        }
        return sb.toString();

    }

    static int n1 = 0, n2 = 1, n3 = 0;

    /*
    static void printFibonacci(int count, int a) {
        int[] ar = new int[count];
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if (a > n3)
                count++;
            else if (a < n3)
                count--;
            printFibonacci(count, a);
        }
    }

    public static ArrayList<Integer> findFibonacciNumbers(int[] array) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int i : array) {
            int a = 0;
            for (int j = 1; j < i; j++) {
                a += j;
            }
            if (a == i)
                ar.add(i);
        }
        return ar;
    }
*/
    public static String findThreeDigitNumbers(Array ar) {
        int[] array = ar.getValue();
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            int a1 = i / 100;
            if (a1  >= 1 && a1  < 10) {
                int a2 = (i - (a1 * 100)) / 10;
                if (a1 != a2) {
                    int a3 = i - a1 * 100 - a2 * 10;
                    if (a3 != a1 & a3 != a2)
                        sb.append(i).append(" ");
                }
            }
        }
        return sb.toString();
    }

    public static Array createRandomArray(int size) {
        Random rand = new Random();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++)
            ar[i] = rand.nextInt(1000);
        return new Array(ar);
    }

    public static Array createConsoleArray(int size) {
        int[] ar = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("\nEnter the value: ");
            ar[i] = NewScanner.scanInt();}
        return new Array(ar);
    }

    public static Array createFileArray(String path) throws FileNotFoundException {
        return new Array(NewScanner.scanFile(path));
    }
}
