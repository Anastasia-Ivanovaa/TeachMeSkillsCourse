package Lesson_7.TaskTwo;

public class Raven extends Animal implements Bird {
    private double maxHeightOfFlight;

    public Raven(String name, int age, double maxHeightOfFlight) {
        super(name, age);
        this.maxHeightOfFlight = maxHeightOfFlight;
    }

    @Override
    public void live() {
        super.live();
        fly();
    }
}
