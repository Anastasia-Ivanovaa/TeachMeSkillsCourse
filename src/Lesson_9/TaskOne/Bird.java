package Lesson_9.TaskOne;

public abstract class Bird extends Animal implements Printable {
    private double heightOfFlight;

    public Bird(String name, int age, double heightOfFlight) {
        super(name, age);
        this.heightOfFlight = heightOfFlight;
    }

    public void fly() {
        System.out.println("I can fly.");
    }

    @Override
    public void printInfo() {
        System.out.println("My maximum height is " + heightOfFlight + ".");
    }

    @Override
    public void live() {
        printInfo();
        super.live();
        fly();
    }
}
