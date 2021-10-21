package by.epamtc.HacakConstantine.task03.Task3.Logic;

public class Logic {

    public static String replaceSymbol(String s, int k, char symbol) {
        for (int i = 0, j = 0; i < s.length() - 1; i++, j++) {
            if (j == k && s.substring(i, i + 1).matches("[a-zA-Z]")) {
                s = s.substring(0, i) + s.substring(i, s.length()).replaceFirst("[a-zA-Z]", String.valueOf(symbol));
            }
            if (s.substring(i, i + 1).matches("\\W")) {
                j = 0;
            }
        }
        return s;
    }

    public static String replaceA(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).matches("PA\\w"))
                s = s.substring(0, i + 1) + s.substring(i + 1, s.length()).replaceFirst("A", "O");
        }
        return s;
    }

    public static String replaceWord(String s, int length, String replacement) {
        for (int i = 0, j = 0; i < s.length() - 2; i++, j++) {
            if (j == length && s.substring(i, i + 2).matches("\\w\\W")) {
                s = s.substring(0, i + 1 - length) + replacement + s.substring(i + 1, s.length());
            }
            while (s.substring(i + 1, i + 2).matches("\\W")) {
                i++;
                j = 0;
            }
        }
        return s;
    }

    public static String deleteNAC(String s) {
        for (int i = 0; i < s.length(); ) {
            if (s.substring(i, i + 1).matches("[\\S&&[\\W |0-9]]")) {
                s = s.substring(0, i) + s.substring(i + 1, s.length());
                if (s.substring(i, i + 2).matches("[a-zA-Z]{2}"))
                    s = s.substring(0, i) + " " + s.substring(i, s.length());
            } else
                i++;
        }
        return s;
    }

    public static String deleteConsonantWords(String s, int length) {
        for (int i = 0, j = 0; i < s.length() - 2; i++, j++) {
            if (s.substring(i, i + 2).matches("\\w\\W")) {
                if (j == length && s.substring(i + 1 - length, i + 2 - length).matches("[^aeiouAEIOU]")) {
                    s = s.substring(0, i - length) + s.substring(i + 1, s.length());
                    i = i - length;
                }
            }
            if (s.substring(i, i + 1).matches("\\W")) {
                j = 0;
            }
        }
        return s;
    }
}
