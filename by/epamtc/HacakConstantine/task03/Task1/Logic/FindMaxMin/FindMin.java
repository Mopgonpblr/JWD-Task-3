package by.epamtc.HacakConstantine.task03.Task1.Logic.FindMaxMin;

import by.epamtc.HacakConstantine.task03.Task1.Logic.FindMaxMin.Find;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/20/21
 * Time: 9:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindMin implements Find {
    @Override
    public int find(int a, int b) {
            if (a < b)
                b = a;
            return b;
    }
}
