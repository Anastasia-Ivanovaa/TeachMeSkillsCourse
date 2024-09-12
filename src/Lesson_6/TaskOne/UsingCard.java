package Lesson_6.TaskOne;

import java.util.Scanner;

public class UsingCard {
    public static void main(String[] args) {

        CreditCard cardOne = new CreditCard(1, "4111111111111111");
        CreditCard cardTwo = new CreditCard(2,"41111111111111112");
        CreditCard cardThree = new CreditCard(3, "4111111111111113");
        cardOne.printCardInfo();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount You want to replenish your account:");
        double amountAdd = scanner.nextDouble();
        cardOne.creditOfFunds(amountAdd);

        System.out.println("Enter amount You want to withdraw: ");
        double amountWithdraw = scanner.nextDouble();
        cardOne.withdrawAmount(amountWithdraw);

        cardOne.printCardInfo();
        cardTwo.printCardInfo();
        cardThree.printCardInfo();

        scanner.close();
    }
}

