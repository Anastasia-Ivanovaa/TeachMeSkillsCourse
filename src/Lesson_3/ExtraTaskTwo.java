package Lesson_3;

import java.util.Arrays;

public class ExtraTaskTwo {
    public static void main(String[] args) {
        // Дополнительная задача 2. Создайте массив строк. Заполните его произвольными именами
        // людей. Отсортируйте массив. Результат выведите на консоль

        String[] names = {"Sam", "Ann", "Liz", "Andrew", "Bob"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
