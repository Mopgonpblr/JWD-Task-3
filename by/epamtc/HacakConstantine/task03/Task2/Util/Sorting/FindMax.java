package by.epamtc.HacakConstantine.task03.Task2.Util.Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/20/21
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindMax implements Find {
    @Override
    public int find(int a, int b) {
            if (a > b)
                b = a;
            return b;
    }
}
