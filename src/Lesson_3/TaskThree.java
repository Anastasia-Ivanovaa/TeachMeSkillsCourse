package Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        // Задача 3. Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random().
        // Пусть будет возможность создавать массив произвольного размера. Пусть размер массива вводится с консоли.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        Random random = new Random();
        int maxValue = array[0];
        int minValue = array[0];
        int sum = 0;
        double average;

        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = random.nextInt(1, 100);
            if (i == 0){
                minValue = array[i];
            }

            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
            sum += array[i];
        }

        average = (double) sum /sizeOfArray;

        System.out.println(Arrays.toString(array));
        System.out.println("The smallest value is " + minValue + ".");
        System.out.println("The greatest value is " + maxValue + ".");
        System.out.println("The average sum is equal to " + average + ".");

        scanner.close();
    }

}

