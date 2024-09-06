package Lesson_3;

import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // Задача 2. Создайте массив целых чисел.
        // Удалите все вхождения заданного числа из массива. Пусть число задается с консоли (класс Scanner).
        // Если такого числа нет - выведите сообщения об этом. В результате должен быть новый массив без указанного числа.

        int[] array = {5, 9, 10, 40, 58, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int enteredNumber = scanner.nextInt();
        int numberFromArray = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == enteredNumber) {
                numberFromArray = array[i];
                index = i;
            }
        }
        System.out.println("The index of number is " + index);

        if (enteredNumber != numberFromArray) {
            System.out.println("There is no such number in the array.");
        }

        int[] changedArray = Arrays.copyOf(array, array.length - 1);
        System.arraycopy(array, index + 1, changedArray, index, array.length - index - 1);
        System.out.println("Changed array: " + Arrays.toString(changedArray));
        scanner.close();
    }
}