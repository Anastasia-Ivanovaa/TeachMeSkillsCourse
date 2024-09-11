package Lesson_6.TaskOne;

import java.util.Scanner;

public class CreditCard {
    public long id;
    public String accountNumber;
    public double currentAccountAmount;


    public void creditOfFunds(double NewAmount) {
        currentAccountAmount += NewAmount;
        System.out.println("Your new amount is " + currentAccountAmount);
    }

    public void withdrawAmount(double amount) {
        currentAccountAmount -= amount;
        System.out.println("Your new amount is " + currentAccountAmount);
    }

}
