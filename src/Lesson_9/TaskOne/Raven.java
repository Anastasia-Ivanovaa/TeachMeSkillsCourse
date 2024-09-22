package Lesson_9.TaskOne;

public class Raven extends Bird {

    public Raven(String name, int age, double heightOfFlight) {
        super(name, age, heightOfFlight);
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.RAVEN;
    }

    @Override
    public void live() {
        super.live();
    }
}
