package Lesson_3;

import java.util.Arrays;
import java.util.Random;

public class TaskFive {
    public static void main(String[] args) {
        // Задача 5. Создайте массив и заполните массив. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int index = i;
            if (index % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
