package by.epamtc.HacakConstantine.task03.Task1.Runner;

import by.epamtc.HacakConstantine.task03.Task1.Model.Array;
import by.epamtc.HacakConstantine.task03.Task1.Logic.Logic;

import java.io.FileNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/18/21
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Array a = Logic.createRandomArray(10);
        System.out.println("Random array: " + a);

        Logic.bubbleSort(a);
        System.out.println("Sorted random array, bubble sort:" + a);

        Array b = Logic.createFileArray("C:\\\\Users\\\\Asus\\\\Desktop\\\\test.txt");
        System.out.println("File array: " + b);

        Logic.selectionSort(b);
        System.out.println("Sorted file array, selection sort:" + b);

        Array c = Logic.createConsoleArray(10);
        System.out.println("Console array: " + c);

        Logic.shellSort(c);
        System.out.println("Sorted console array, shell sort:" + c);


        int i = a.getValue()[3];
        int searchResult = Logic.binarySearch(a, i);
        if (searchResult != -1)
            System.out.println("a[" + searchResult + "] = " + i);
        else
            System.out.println("Not found");

        System.out.println("MAX: " + Logic.findMax(a));
        System.out.println("MIN: " + Logic.findMin(a));

        System.out.println("Prime numbers: " + Logic.findSimpleNumbers(a));

        System.out.println("Three digit numbers without repeats: " + Logic.findThreeDigitNumbers(a));
    }
}
