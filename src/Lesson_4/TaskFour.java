package Lesson_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        // Задача 4. Создать двумерный массив  m*n, где m,n вводятся с клавиатуры, оба >= 3.
        // Заполнить случайными числами, отсортировать каждую строку отдельно по возрастанию с применением Arrays.sort()

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();

        if (!(rows >= 3 && columns >= 3)) {
            System.out.println("The number should be more or equal 3. Please try again.");
            return;
        }

        Random random = new Random();
        int[][] array = new int[rows][columns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(-100, 100);
            }
        }

        for (int i =0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        System.out.println("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
