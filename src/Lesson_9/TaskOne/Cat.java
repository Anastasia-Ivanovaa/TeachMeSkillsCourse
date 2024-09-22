package Lesson_9.TaskOne;

public class Cat extends Animal implements Saying {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.CAT;
    }

    @Override
    public void say() {
        System.out.println("Meoww!");
    }

    @Override
    public void live() {
        super.live();
        say();
    }
}
