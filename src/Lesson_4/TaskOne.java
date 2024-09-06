package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // Задача 1. Создать трехмерный массив из целых чисел, заполнить случайными числами от -100 до 100.
        // С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
        // Пусть число, на которое будет увеличиваться каждый элемент,задается из консоли.

        Scanner scanner = new Scanner(System.in);

        int[][][] threeDimensionlArray = new int[3][3][5];
        Random random = new Random();

        for (int i = 0; i < threeDimensionlArray.length; i++) {
            for (int j = 0; j < threeDimensionlArray[i].length; j++) {
                for (int k = 0; k < threeDimensionlArray[i][j].length; k++) {
                    threeDimensionlArray[i][j][k] = random.nextInt(-100, 100);
                    System.out.print(threeDimensionlArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Enter a number by which the every element will be increased: ");
        int increasingNumber = scanner.nextInt();
        System.out.println("Changed array ");

        for (int i = 0; i < threeDimensionlArray.length; i++) {
            for (int j = 0; j < threeDimensionlArray[i].length; j++) {
                for (int k = 0; k < threeDimensionlArray[i][j].length; k++) {
                    threeDimensionlArray[i][j][k] += increasingNumber;
                    System.out.print(threeDimensionlArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        scanner.close();
    }
}




