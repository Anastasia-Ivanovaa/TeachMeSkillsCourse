package Lesson_2;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
