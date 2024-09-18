package Lesson_7.TaskTwo;

public class Parrot extends Animal implements Bird, Saying {
    public double heightOgFlight;
    private final String color;

    public Parrot(String name, int age, String color, double heightOgFlight) {
        super(name, age);
        this.color = color;
        this.heightOgFlight = heightOgFlight;
    }

    @Override
    public void say() {
        System.out.println("Chirp-chirp!");
    }

    @Override
    public void live() {
        super.live();
        say();
    }
}
