package by.epamtc.HacakConstantine.task03.Task2.Util.Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/20/21
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
import by.epamtc.HacakConstantine.task03.Task2.Util.Logic;

public class Decrease implements Direction {

    public int process(int[][] array, int a, int b, int i){
        if (a < b) {
            Logic.swap(array, i, i + 1);
            i = 0;
        } else
            i++;
        return i;
    }
}
