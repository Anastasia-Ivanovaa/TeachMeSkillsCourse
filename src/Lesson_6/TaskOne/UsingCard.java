package Lesson_6.TaskOne;

import java.util.Scanner;

public class UsingCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CreditCard cardOne = new CreditCard(1, "4111111111111111");
        System.out.println("Enter the amount on card one: ");

        cardOne.setCurrentAccountAmount(scanner.nextDouble());

        CreditCard cardTwo = new CreditCard(2, "4111111111111112");
        System.out.println("Enter the amount on card two: ");

        cardTwo.setCurrentAccountAmount(scanner.nextDouble());

        CreditCard cardThree = new CreditCard(3, "4111111111111113");
        System.out.println("Enter the amount on card three: ");

        cardThree.setCurrentAccountAmount(scanner.nextDouble());

        System.out.println("Enter amount You want to put on card one:");
        cardOne.creditOfFunds(scanner.nextDouble());

        System.out.println("Enter amount You want to put on card two:");
        cardTwo.creditOfFunds(scanner.nextDouble());

        System.out.println("Enter amount You want to take from card three: ");
        cardThree.withdrawAmount(scanner.nextDouble());

        cardOne.printCardInfo();
        cardTwo.printCardInfo();
        cardThree.printCardInfo();

        scanner.close();
    }
}

