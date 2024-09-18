package Lesson_7.TaskTwo;

public class Cat extends Animal implements Saying {

    public Cat(String name, int age) {
        super(name, age);
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
