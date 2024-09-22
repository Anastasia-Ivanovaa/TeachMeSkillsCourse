package Lesson_9.TaskOne;

public class Parrot extends Bird implements Saying {

    private final String colour;

    public Parrot(String name, int age, String colour, double heightOgFlight) {
        super(name, age, heightOgFlight);
        this.colour = colour;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.PARROT;
    }

    @Override
    public void say() {
        System.out.println("Chirp-chirp!");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("My color is " + colour + ".");
    }

    @Override
    public void live() {
        super.live();
        say();
    }
}
