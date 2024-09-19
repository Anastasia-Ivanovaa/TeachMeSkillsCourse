package Lesson_8.TaskOne;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public String getNumber() {
        return number;

    }

    public Phone() {
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, double weight, String number) {
        this(model, number);
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("The model of phone is " + model + "." + "\n" + "The weight is " + weight + "." + "\n" + "The number is " + number + ".");
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling.");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling." + "\n" + callerNumber + "\n");
    }

    public void sendMessage(String... phoneNumber) {
        for (String s : phoneNumber) {
            System.out.println("Send message to this phone number please: " + s);
        }
    }

}
