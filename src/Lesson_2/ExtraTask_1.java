package Lesson_2;

import java.util.Scanner;

public class ExtraTask_1 {
    public static void main(String[] args) {
        // Преобразовать задачу 2 таким образом, чтобы число запрашивалось у пользователя постоянно, пока он не введет какое-нибудь число 2 раза подряд.
        // Если это случилось, программа прекращает выполнение
        int number = 0;
        int previouslyEnteredNumber = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; (i == 0 || (previouslyEnteredNumber != number)); i++) {
            System.out.println("Enter a number: ");
            previouslyEnteredNumber = number;
            number = scanner.nextInt();
            if (number % 2 == 0) {
                System.out.println("This number is even.");
            } else {
                System.out.println("This number is odd.");
            }
        }
    }
}
