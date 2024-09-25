package Lesson_9.TaskOne;

public class Dog extends Animal implements Saying, Printable {

    private String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.DOG;
    }

    @Override
    public void say() {
        System.out.println("Woof-woof!");
    }

    public void walk() {
        System.out.println("Dog is being walked by its owner now.");
    }

    @Override
    public void printInfo() {
        System.out.println("My owner's name is " + ownerName + ".");
    }

    @Override
    public void live() {
        printInfo();
        super.eat();
        walk();
        say();
    }
}
