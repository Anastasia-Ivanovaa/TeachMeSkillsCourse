package Lesson_2;

public class TaskSix {
    public static void main(String[] args) {
        //Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        //В решении используйте цикл while.

        int number = 1;

        while (number <= 14) {
            System.out.print((number * 7) + " ");
            number++;
        }
    }
}



