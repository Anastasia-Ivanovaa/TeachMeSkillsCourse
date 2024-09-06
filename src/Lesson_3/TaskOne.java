package Lesson_3;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // Задача 1. Создайте массив целых чисел.
        // Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
        // Пусть число для поиска задается с консоли (класс Scanner).

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int numberFromArray = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == number) {
                numberFromArray = array[i];
           }
        }
        if (number != numberFromArray) {
            System.out.println("There is no such number in the array.");
        } else {
            System.out.println("There is such number in the array.");
        }
        scanner.close();
    }
}
