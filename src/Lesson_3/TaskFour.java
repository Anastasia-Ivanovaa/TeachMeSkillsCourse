package Lesson_3;

import java.util.Arrays;
import java.util.Random;

public class TaskFour {
    public static void main(String[] args) {
        // Задача 4. Создайте 2 массива из 5 чисел. Выведите массивы на консоль в двух отдельных строках.
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
        // это значение оказалось больше (либо сообщите, что их средние арифметические равны).

        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        Random random = new Random();
        int sumOfArrayOne = 0;
        int sumOfArrayTwo = 0;
        double firstAverage;
        double secondAverage;

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = random.nextInt(100);
            sumOfArrayOne += arrayOne[i];
        }
        firstAverage = (double) sumOfArrayOne / arrayOne.length;
        System.out.println("The first array - " + Arrays.toString(arrayOne));
        System.out.println("The average number of first array is " + firstAverage);

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = random.nextInt(100);
            sumOfArrayTwo += arrayTwo[i];
        }
        secondAverage = (double) sumOfArrayTwo / arrayTwo.length;
        System.out.println("The second array - " + Arrays.toString(arrayTwo));
        System.out.println("The average number of second array is " + secondAverage);

        if (firstAverage > secondAverage) {
            System.out.println("The average of the first array is bigger than one of second array.");
        } else if ( firstAverage == secondAverage) {
            System.out.println("The averages of both arrays are equal.");
        }
        else {
            System.out.println("The average of the second array is bigger than one of first array. ");
        }
    }
}
