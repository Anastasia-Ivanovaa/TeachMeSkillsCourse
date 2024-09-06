package Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExtraTaskOne {
    public static void main(String[] args) {
        // Дополнительная задача 1. Создайте массив из n случайных целых чисел и выведите его на
        // экран. Размер массива пусть задается с консоли и размер массива может быть
        // больше 5 и меньше или равно 10. Если n не удовлетворяет условию - выведите сообщение об этом.
        // Если пользователь ввёл не подходящее число, то программа должна
        // просить пользователя повторить ввод. Создайте второй массив только из чётных элементов первого массива,
        // если они там есть, и вывести его на экран.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        Random random = new Random();

        if (arrayLength > 5 && arrayLength <= 10) {
            for (int i = 0; i < arrayLength; i++) {
                array[i] = random.nextInt(1, 100);
            }
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("The length should be greater than 5 and less or equal to 10.");
            System.out.println("Please enter the length one more time: ");
            arrayLength = scanner.nextInt();
        }

        int qtyOfEvenNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                qtyOfEvenNumbers += 1;
            }
        }
        int[] arrayNew = new int[qtyOfEvenNumbers];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                 arrayNew[j] = array[i];
                 j++;
                }
            }
        System.out.println(Arrays.toString(arrayNew));
        scanner.close();
        }
    }




