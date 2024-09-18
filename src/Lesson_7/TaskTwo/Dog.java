package Lesson_7.TaskTwo;

public class Dog extends Animal implements Saying {

    private String ownerName;

    public Dog(String name, int age, String ownerName) {
        super(name, age);
        this.ownerName = ownerName;
    }

    @Override
    public void say() {
        System.out.println("Woof-woof!");
    }

    public void walk() {
        System.out.println("Dog # " + "is being walked by its owner now.");
    }

    @Override
    public void live() {
        super.eat();
        walk();
        say();
    }

}
