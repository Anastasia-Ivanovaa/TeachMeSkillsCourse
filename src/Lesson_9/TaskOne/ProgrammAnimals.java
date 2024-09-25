package Lesson_9.TaskOne;

import Lesson_8.TaskTwo.Type;
import Lesson_9.TaskTwo.WrongLoginException;

import java.util.Random;
import java.util.Scanner;

import static Lesson_9.TaskOne.AnimalType.CAT;
import static Lesson_9.TaskOne.AnimalType.DOG;
import static Lesson_9.TaskOne.UserAction.*;

public class ProgrammAnimals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
            System.out.println(animals[i]);
        }

        System.out.println("Cat can EAT, SAY");
        System.out.println("Dog can EAT, SAY, WALK");
        System.out.println("Fish can EAT, SWIM");
        System.out.println("Parrot can EAT, FLY");
        System.out.println("Raven can EAT, FLY");


        while (true) {

            System.out.println("Select the action for animals: ");

            for (UserAction action : UserAction.values()) {
                System.out.println(action.getCode() + " - " + action.getDescription());
            }
            int code = scanner.nextInt();

            UserAction action = UserAction.valueof(code);
            if (action == null) {
                System.out.println("There is no such action in the list. Please try again.");
            } else if (action == UserAction.EXIT) {
                return;
            } else {
                proccessArray(animals, action);
            }

        }

    }

    private static Animal getRandomAnimal() {
        Random random = new Random();
        int flag = random.nextInt(AnimalType.values().length);
        int age = random.nextInt(1, 15);

        AnimalType type = AnimalType.values()[flag];
        return switch (type) {
            case CAT -> new Cat("Star", age);
            case DOG -> new Dog("Lucky", age, "Bob");
            case FISH -> new Fish("Dori", age);
            case PARROT -> new Parrot("Petey", age, "blue", 20.0);
            case RAVEN -> new Raven("Brave", age, 50.5);
        };
    }

    private static void proccessArray(Animal[] array, UserAction action) {
        switch (action) {
            case EAT -> {
                for (Animal animal : array) {
                    animal.eat();
                }
            }
            case SAY -> {
                for (Animal animal : array) {
                    try {
                        ((Saying) animal).say();
                    } catch (Exception e) {
                        System.out.println(animal.getName() + " doesn't say.");
                    }
                }
            }
            case WALK -> {
                for (Animal animal : array) {
                    try {
                        ((Dog) animal).walk();
                    } catch (Exception e) {
                        System.out.println(animal.getName() + " doesn't walk.");
                    }
                }
            }
            case SWIM -> {
                for (Animal animal : array) {
                    try {
                        ((Fish) animal).swim();
                    } catch (Exception e) {
                        System.out.println(animal.getName() + " doesn't swim.");
                    }
                }
            }
            case FLY -> {
                for (Animal animal : array) {
                    try {
                        ((Bird) animal).fly();
                    } catch (Exception e) {
                        System.out.println(animal.getName() + " doesn't fly.");
                    }
                }
            }

        }
    }
}