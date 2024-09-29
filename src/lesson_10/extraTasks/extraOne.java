package lesson_10.extraTasks;

import java.util.Scanner;

public class extraOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the words: ");
        String enteredWords = scanner.nextLine();

        String[] wordsArray = enteredWords.split(" ");

        String longestWord = "";
        String shortestWord = wordsArray[0];
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].length() >= longestWord.length()) {
                longestWord = wordsArray[i];
            } else if (wordsArray[i].length() <= shortestWord.length()) {
                shortestWord = wordsArray[i];
            }
        }
        System.out.println(longestWord);
        System.out.println(shortestWord);
    }
}
