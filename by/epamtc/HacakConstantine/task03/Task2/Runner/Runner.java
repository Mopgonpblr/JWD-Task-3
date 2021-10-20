package by.epamtc.HacakConstantine.task03.Task2.Runner;


import by.epamtc.HacakConstantine.task03.Task2.Util.Logic;
import by.epamtc.HacakConstantine.task03.Task2.Util.Sorting.*;

public class Runner {
    public static void main(String[] args) {
        int[][] jaggedArray =
                {
                        new int[]{1, 3, 5, 7, 9},
                        new int[]{0, 2, 4, 6, 23},
                        new int[]{11, 22}
                };

        int[][] jaggedArray2 =
                {
                        new int[]{29, 11, 26, 32, 66},
                        new int[]{96, 61, 25, 20, 13, 67, 39},
                        new int[]{79, 51, 40},
                        new int[]{28, 63, 33, 54, 14}
                };
        int[][] jaggedArray3 =
                {
                        new int[]{23, 16, 26, 39, 63},
                        new int[]{91, 96, 50, 12, 31, 60, 95},
                        new int[]{43, 32, 25, 34}
                };

        output("Original array 1", jaggedArray);

        Logic.sort(jaggedArray, new Increase(), new Sum());
        output("\nSum, increase:", jaggedArray);

        output("\nOriginal array 2", jaggedArray2);

        Logic.sort(jaggedArray2, new Decrease(), new Max());
        output("\nMax element, decrease:", jaggedArray2);

        output("\nOriginal array 3", jaggedArray3);

        Logic.sort(jaggedArray3, new Increase(), new Min());
        output("\nMin element, increase:", jaggedArray3);
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
