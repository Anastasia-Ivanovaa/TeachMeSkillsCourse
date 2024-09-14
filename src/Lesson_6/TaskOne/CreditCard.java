package Lesson_6.TaskOne;


public class CreditCard {
    private final long id;
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
    }

    public void withdrawAmount(double amount) {
        currentAccountAmount -= amount;
    }

    public void printCardInfo() {
        System.out.println("Card number: " + accountNumber + ", " + "amount on card: " + currentAccountAmount);
    }

}

