package lesson_10.extraTasks;

import java.util.Arrays;
import java.util.Scanner;

public class extraTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String enteredString = scanner.nextLine();

        String[] wordsArray = enteredString.split(" ");

        int count = 0;
        int index = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            char[] elements = new char[wordsArray[i].length()];
            wordsArray[i].getChars(0, wordsArray[i].length(), elements, 0);
            System.out.println(Arrays.toString(elements));
            int elementCounter = 0;

            for (int j = 0; j < elements.length; j++) {
                if(j != 0) {
                    if (elements[j] == elements[j-1]) {
                        elementCounter++;
                    }
                }
            }

            if(elementCounter > count) {
                count = elementCounter;
                index = i;
            }
        }

        System.out.println(wordsArray[index]);
    }
}



