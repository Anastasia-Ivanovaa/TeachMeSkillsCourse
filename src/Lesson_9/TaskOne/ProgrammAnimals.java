package Lesson_9.TaskOne;

import java.util.Random;
import java.util.Scanner;

public class ProgrammAnimals {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
            System.out.println(animals[i]);
            AnimalType type = animals[i].getAnimalType();
            checkType(type);
            String selectedAction= scanner.nextLine();
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

    public static void checkType(AnimalType type) {
        switch (type) {
            case CAT -> System.out.println("Select the action for Cat: EAT, SAY");
            case DOG -> System.out.println("Select the action for Dog: EAT, SAY, WALK");
            case FISH -> System.out.println("Select the action for Fish: EAT, SWIM");
            case PARROT -> System.out.println("Select the action for Parrot: EAT, FLY");
            case RAVEN -> System.out.println("Select the action for Raven: EAT, FLY");
        }

    }
}