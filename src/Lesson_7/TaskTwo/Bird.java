package Lesson_7.TaskTwo;

public interface Bird {

    default void fly() {
        System.out.println("I can fly.");
    }

}
