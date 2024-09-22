package Lesson_9.TaskOne;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.FISH;
    }

    public void swim() {
        System.out.println("I can swim.");
    }

    @Override
    public void live() {
        super.live();
        swim();
    }
}
