package by.epamtc.HacakConstantine.task03.Task3.Runner;

import by.epamtc.HacakConstantine.task03.Task3.Logic.Logic;


public class Runner {
    public static void main(String[] args) {
        String s = "Fibonacci numbers are named after the Italian mathematician Leonardo of Pisa, later known as Fibonacci. In his 1202 book Liber Abaci, Fibonacci introduced the sequence to Western European mathematics";
        output("Original: ", s);
        output("    Every fifth letter in a word is replaced by *\n", Logic.replaceSymbol(s, 5, '*'));
        System.out.println();

        String s2 = "PAPAPAPOPA OPOPOP APAPA";
        output("Original: ", s2);
        output("    If A follows P and isn't the last letter in the word, it's replaced by O\n",Logic.replaceA(s2));
        System.out.println();

        output("Original: ", s);
        output("    Every 5 letter word is replaced by \"candies\"\n",Logic.replaceWord(s, 5, "candies"));
        System.out.println();

        output("Original: ", s);
        output("    Every not a letter symbol, except space, is deleted\n", Logic.deleteNAC(s));
        System.out.println();

        output("Original: ", s);
        output("    Every word that starts with a consonant letter is deleted\n", Logic.deleteConsonantWords(s, 5));
    }

    private static void output(String message, String result) {
        if (message != null && result != null) {
            System.out.println(message+result);
        }
    }
}
