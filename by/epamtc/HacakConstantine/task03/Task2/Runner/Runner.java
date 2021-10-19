package by.epamtc.HacakConstantine.task03.Task2.Runner;

import by.epamtc.HacakConstantine.task03.Task2.Util.Condition;
import by.epamtc.HacakConstantine.task03.Task2.Util.Direction;
import by.epamtc.HacakConstantine.task03.Task2.Util.Logic;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[][] jaggedArray =
                {
                        new int[]{1, 3, 5, 7, 9},
                        new int[]{0, 2, 4, 6, 23},
                        new int[]{11, 22}
                };
        output("Original array", jaggedArray);

        int[][] jaggedArray2 = Logic.sort(jaggedArray, Direction.INCREASE, Condition.SUM);
        output("\nSum, increase:", jaggedArray2);

        int[][] jaggedArray3 = Logic.sort(jaggedArray, Direction.DECREASE, Condition.MAX);
        output("\nMax element, decrease:", jaggedArray3);

        int[][] jaggedArray4 = Logic.sort(jaggedArray, Direction.INCREASE, Condition.MIN);
        output("\nMin element, increase:", jaggedArray4);
    }

    private static void output(String message, int[][] jaggedArray) {
        if (jaggedArray != null) {
            System.out.println(message);
            for (int[] i : jaggedArray) {
                System.out.print("[");
                for (int j : i)
                    System.out.print(j + " ");
                System.out.println("]");
            }
        }
    }
}
