package Lesson_2;

import java.util.Scanner;

public class TaskThree {
    //Задача 3. Для введенного числа t (температура на улице) вывести
    // Если t>–5, то вывести «Тепло».
    // Если –5>= t > –20, то вывести «Нормально».
    // Если –20>= t, то вывести «Холодно».

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("It's warm.");
        } else if (t <= -20) {
            System.out.println("It's cold.");
        } else if (t <= -5 && t > -20) {
            System.out.println("It's ok.");
        }
        scanner.close();
    }
}
