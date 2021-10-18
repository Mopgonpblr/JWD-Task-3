package by.epamtc.HacakConstantine.task03.Task3.Logic;

public class Logic {

    public static String replaceSymbol(String string, int k, char symbol) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0, j = 0; i < sb.length(); i++, j++) {
            if (j == k && Character.isAlphabetic(sb.charAt(i)))
                sb.replace(i, i + 1, String.valueOf(symbol));
            if (sb.charAt(i) == ' ')
                j = 0;
        }
        return sb.toString();
    }

    public static String replaceA(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0, j = 0; i < sb.length() - 2; i++, j++) {
            if (sb.charAt(i) == 'P' && sb.charAt(i + 1) == 'A' && Character.isAlphabetic(sb.charAt(i + 2)))
                sb.replace(i + 1, i + 2, "O");
            if (sb.charAt(i) == ' ')
                j = 0;
        }
        return sb.toString();
    }

    public static String replaceWord(String string, int length, String replacement) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0, j = 0; i < sb.length(); i++, j++) {
            if (sb.charAt(i) == ' ') {
                if (j == length && Character.isAlphabetic(sb.charAt(i - 1))) {
                    sb.delete(i - length, i);
                    sb.insert(i - length, replacement);
                }
                i++;
                j = 0;
            }
        }
        return sb.toString();
    }

    public static String deleteNAC(String string) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); ) {
            if (sb.charAt(i) != ' ' && !Character.isLetter(sb.charAt(i))) {
                sb.delete(i, i + 1);
                if (Character.isLetter(sb.charAt(i)) && Character.isLetter(sb.charAt(i + 1)))
                    sb.insert(i, " ");
            } else
                i++;
        }
        return sb.toString();
    }

    public static String deleteConsonantWords(String string, int length) {
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0, j = 0; i < sb.length() - 2; i++, j++) {
            if (sb.charAt(i) == ' ') {
                if (j == length && Character.isAlphabetic(sb.charAt(i - 1))) {
                    switch (sb.charAt(i - length)) {
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                        case 'A':
                        case 'E':
                        case 'I':
                        case 'O':
                        case 'U':
                            break;
                        default:
                            sb.delete(i - length, i + 1);
                            break;
                    }

                }
                i++;
                j = 0;
            }
        }
        return sb.toString();
    }
}
