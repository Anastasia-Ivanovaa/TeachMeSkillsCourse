package lesson_10.taskOne;

public class StringParser {


    public static String getTwoFirstNumberBlocks(String string) {
        String[] docNumberSplitted = string.split("-");
        String[] array = new String[2];
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                array[0] = docNumberSplitted[i];
            } else if (i == 2) {
                array[1] = docNumberSplitted[i];
            }
        }
        String firstTwoElements = String.join(" ", array);
        return firstTwoElements;
    }

    public static String changeCharacterToAsterisk(String string) {
        int indexOne = string.indexOf("-") + 1;
        int indexTwo = string.lastIndexOf("-") - 1;
        StringBuilder sb = new StringBuilder(string);
        for (int i = indexOne; i < indexOne + 3; i++) {
            sb.setCharAt(i, '*');
        }

        for (int i = indexTwo; i > indexTwo - 3; i--) {
            sb.setCharAt(i, '*');
        }
        return String.valueOf(sb);
    }

    public static String getOnlyLettersLowerCase(String string) {
        String stringLetters = string.replaceAll("[^a-zA-Z]", "");
        String lowerCase = stringLetters.toLowerCase();
        StringBuilder sb = new StringBuilder(lowerCase);
        sb.insert(3, "/");
        sb.insert(7, "/");
        sb.insert(9, "/");
        String result = sb.toString();
        return result;
    }

    public static String getOnlyLettersUpperCase(String string) {
        String stringLetters = string.replaceAll("[^a-zA-Z]", "");
        String upperCase = stringLetters.toUpperCase();
        StringBuilder sb = new StringBuilder(upperCase);
        sb.insert(3, "/");
        sb.insert(7, "/");
        sb.insert(9, "/");
        StringBuilder letters = new StringBuilder("Letters:");
        StringBuilder resultSb = letters.append(sb);
        String result = resultSb.toString();
        return result;
    }

    public static boolean contains(String string, String substring) {
        return string.toLowerCase().contains(substring.toLowerCase());
    }

    public static boolean startsWith(String string, String substring) {
        return string.toLowerCase().startsWith(substring.toLowerCase());
    }

    public static boolean endsWith(String string, String substring) {
        return string.toLowerCase().endsWith(substring.toLowerCase());
    }
}

