package Lesson_6.TaskOne;

import java.util.Scanner;

public class CreditCard {
    private long id;
    private String accountNumber;
    private double currentAccountAmount;

    public void setCurrentAccountAmount(double currentAccountAmount) {
        if (currentAccountAmount < 0) {
            System.out.println("The amount must be more than 0. Please try again.");
            return;
        }
        this.currentAccountAmount = currentAccountAmount;
    }

    public CreditCard(long id, String accountNumber) {
        this.id = id;
        this.accountNumber = accountNumber;
    }


    public void creditOfFunds(double NewAmount) {
        currentAccountAmount += NewAmount;
        System.out.println("Your new amount is " + currentAccountAmount);
    }

    public void withdrawAmount(double amount) {
        currentAccountAmount -= amount;
        System.out.println("Your new amount is " + currentAccountAmount);
    }

    public void printCardInfo() {
        System.out.println("Card number: " + accountNumber + "," + "Current Account Amount: " + currentAccountAmount);
    }

}

