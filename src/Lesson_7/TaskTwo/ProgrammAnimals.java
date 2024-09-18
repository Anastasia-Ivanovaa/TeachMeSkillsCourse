package Lesson_7.TaskTwo;

import java.util.Random;

public class ProgrammAnimals {
    public static void main(String[] args) {

        Animal[] animals = new Animal[10];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = getRandomAnimal();
        }

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.live();
            System.out.println("\n");

        }
    }

    private static Animal getRandomAnimal() {
        Random random = new Random();
        int flag = random.nextInt(5);
        int age = random.nextInt(1, 15);
        if (flag == 0) {
            return new Cat("Star", age);
        } else if (flag == 1) {
            return new Dog("Lucky", age, "Bob");
        } else if (flag == 2) {
            return new Raven("Brave", age, 50.5);
        } else if (flag == 3) {
            return new Fish("Dori", age);
        }
        {
            return new Parrot("Petey", age, "blue", 20.0);
        }
    }
}