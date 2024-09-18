package Lesson_7.TaskTwo;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
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
