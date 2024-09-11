package Lesson_6.TaskOne;

import java.util.Scanner;

public class UsingCard {
    public static void main(String[] args) {

        CreditCard cardOne = new CreditCard();
        cardOne.id = 1;
        cardOne.accountNumber = "4111111111";
        cardOne.currentAccountAmount = 1000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount You want to replenish your account:");
        double amountAdd = scanner.nextDouble();
        cardOne.creditOfFunds(amountAdd);

        System.out.println("Enter amount You want to withdraw: ");
        double amountWithdraw = scanner.nextDouble();
        cardOne.withdrawAmount(amountWithdraw);
        scanner.close();
    }
}

