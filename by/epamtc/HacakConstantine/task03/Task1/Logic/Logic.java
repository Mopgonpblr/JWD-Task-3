package by.epamtc.HacakConstantine.task03.Task1.Logic;

import by.epamtc.HacakConstantine.task03.NewScanner;
import by.epamtc.HacakConstantine.task03.Task1.Model.Array;
import by.epamtc.HacakConstantine.task03.Task1.Logic.FindMaxMin.*;

import java.io.FileNotFoundException;
import java.util.Random;

public class Logic {
    public static void selectionSort(Array ar) {
        int[] array = ar.getValue();
        int min = 0;
        for (int j = 0; j < array.length; ) {
            for (int i = j; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }
            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
            j++;
            min = j;
        }
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

    public static void shellSort(Array ar) {
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
    }

    public static String binarySearch(Array ar, int key) {
        int[] array = ar.getValue();
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
                return "a[" + mid + "] = " + array[mid];
        }
        return "Element not found";
    }

    public static int findMaxMin(Array ar, Find find) {
        int[] array = ar.getValue();
        int m = array[0];
        for (int i : array)
            find.find(i, m);
        return m;
    }

    public static String findPrimeNumbers(Array ar) {
        StringBuilder sb = new StringBuilder();
        int[] array = ar.getValue();
        for (int i = 0; i < array.length; i++)
            for (int j = 2; array[i] % j != 0; ++j)
                if (j == array[i] / 2)
                    sb.append(array[i]).append(" ");

        return sb.toString();
    }


    public static String findFibonacciNumbers(Array ar) {
        int n1 = 0, n2 = 1, n3 = 0;
        int[] array = ar.getValue();
        StringBuilder sb = new StringBuilder();
        int a = findMaxMin(ar, new FindMax());
        for (int j = 0; n3 < a; j++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            for (int f = 0; f < array.length; f++)
                if (array[f] == n3)
                    sb.append(array[f]).append(" ");
        }
        return sb.toString();
    }


    public static String findThreeDigitNumbers(Array ar) {
        int[] array = ar.getValue();
        StringBuilder sb = new StringBuilder();
        int a1, a2, a3;
        for (int i : array) {
            a1 = i / 100;
            if (a1 >= 1 && a1 < 10) {
                a2 = (i - (a1 * 100)) / 10;
                if (a1 != a2) {
                    a3 = i - a1 * 100 - a2 * 10;
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
            ar[i] = rand.nextInt(500);
        return new Array(ar);
    }

    public static Array createConsoleArray(int size) {
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter the value: ");
            ar[i] = NewScanner.scanInt();
        }
        return new Array(ar);
    }

    public static Array createFileArray(String path) throws FileNotFoundException {
        return new Array(NewScanner.scanFile(path));
    }
}
