package Lesson_2;

import java.util.Scanner;

public class ExtraTask_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a deposit: ");
        float deposit = scanner.nextFloat();
        System.out.println("Enter the quantity of months: ");
        int quantityOfMonths = scanner.nextInt();
        float finalSumOfPercents = 0;

        for (int i = 1; i <= 12; i++) {
            float sumInMonths = deposit * 7 / 100;
            finalSumOfPercents = sumInMonths * i;
            System.out.println("Sum for " + i + " month" + " is " + finalSumOfPercents);
            if (quantityOfMonths == i) {
                break;
            }
        }
        float total = deposit + finalSumOfPercents;
        System.out.println("Total is " + total);
        scanner.close();

    }
}
