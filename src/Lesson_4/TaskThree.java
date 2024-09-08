package Lesson_4;


import java.util.Random;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        // Задача 3. Создайте двумерный массив размера n*n, n вводится с консоли от 2 до 6, после чего заполняется случайными элементами от -100 до 100.
        // Выведите на консоль сумму элементов диагоналей массива.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 2 to 6: ");
        int number = scanner.nextInt();

        if (number < 2 || number > 6) {
            return;
        }
        Random random = new Random();

        int[][] array = new int[number][number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = random.nextInt(-100, 100);
            }
        }

        System.out.println("Created array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sumOfMainDiagonal = 0;
        int sumOfExtraDiagonal = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    sumOfMainDiagonal += array[i][j];
                }
                if (i + j == array.length - 1) {
                    sumOfExtraDiagonal += array[i][j];
                }
            }
        }

        int generalSum = sumOfMainDiagonal + sumOfExtraDiagonal;

        System.out.println("The sum of main diagonal " + sumOfMainDiagonal + ".");
        System.out.println("The sum of extra diagonal " + sumOfExtraDiagonal + ".");
        System.out.println("The sum of two diagonals are " + generalSum + ".");
        scanner.close();
    }
}
