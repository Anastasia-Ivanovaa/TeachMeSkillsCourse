package lesson_10;

public class StringParser {

    public StringParser() {
    }

    public StringParser(String documentNumber) {
    }

    public static String getTwoFirstNumberBlocks(String string) {
        String[] docNumberSplitted = string.split("-");
        String[] array = new String[2];
        for (int i = 0; i < string.length(); i++) {
            if (i == 0) {
                array[0] = docNumberSplitted[i];
            } else if (i==2){
                array[1]= docNumberSplitted[i];
            }
        }

        String firstTwoElements = String.join(" ", array);
        return firstTwoElements;
    }

}
