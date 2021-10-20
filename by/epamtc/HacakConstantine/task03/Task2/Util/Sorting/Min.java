package by.epamtc.HacakConstantine.task03.Task2.Util.Sorting;

import by.epamtc.HacakConstantine.task03.Task2.Util.Logic;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 10/20/21
 * Time: 9:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Min implements Condition {
    public int process(int[] arr){
        return Logic.findMinMax(arr, new FindMin());
    }
}
