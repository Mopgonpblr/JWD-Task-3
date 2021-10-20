package by.epamtc.HacakConstantine.task03.Task1.Runner;

import by.epamtc.HacakConstantine.task03.Task1.Model.Array;
import by.epamtc.HacakConstantine.task03.Task1.Logic.Logic;

import java.io.FileNotFoundException;
import by.epamtc.HacakConstantine.task03.Task1.Logic.FindMaxMin.*;


public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Array a = Logic.createRandomArray(10);
        System.out.println("Random array: " + a);

        Logic.bubbleSort(a);
        System.out.println("Sorted random array, bubble sort:" + a);

        //Array b = Logic.createFileArray("C:\\\\Users\\\\Asus\\\\Desktop\\\\test.txt");
        Array b = Logic.createFileArray("C:\\Documents and Settings\\Administrator\\Desktop\\\\test.txt");

        System.out.println("File array: " + b);

        Logic.selectionSort(b);
        System.out.println("Sorted file array, selection sort:" + b);

        Array c = Logic.createConsoleArray(10);
        System.out.println("Console array: " + c);

        Logic.shellSort(c);
        System.out.println("Sorted console array, shell sort:" + c);


        int i = a.getValue()[3];
        System.out.println("Binary search: " + Logic.binarySearch(a, i));

        System.out.println("MAX: " + Logic.findMaxMin(a, new FindMax()));
        System.out.println("MIN: " + Logic.findMaxMin(a, new FindMin()));

        System.out.println("Prime numbers: " + Logic.findPrimeNumbers(a));

        System.out.println("Three digit numbers without digit repeats: " + Logic.findThreeDigitNumbers(a));

        System.out.println("Fibonacci numbers: "+Logic.findFibonacciNumbers(b));
    }
}
