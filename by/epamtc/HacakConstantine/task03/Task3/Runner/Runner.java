package by.epamtc.HacakConstantine.task03.Task3.Runner;

import by.epamtc.HacakConstantine.task03.Task3.Logic.Logic;


public class Runner {
    public static void main(String[] args) {
        String s="Fibonacci numbers are named after the Italian mathematician Leonardo of Pisa, later known as Fibonacci. In his 1202 book Liber Abaci, Fibonacci introduced the sequence to Western European mathematics";
        System.out.println(Logic.replaceSymbol(s,5,'$'));
        String s2="PAPAPAPOPA OPOPOP APAPA";
        System.out.println(Logic.replaceA(s2));
        System.out.println(Logic.replaceWord(s,5,"candies"));
        System.out.println(Logic.deleteNAC(s));
        System.out.println(Logic.deleteConsonantWords(s,5));
    }
}
