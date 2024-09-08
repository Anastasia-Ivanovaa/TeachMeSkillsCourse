package Lesson_4;

public class TaskTwo {
    public static void main(String[] args) {
        // Задача 2. Шахматная доска
        // Создать программу для раскраски шахматной доски с помощью цикла. Создать двумерный массив char'ов 8х8. С помощью циклов задать элементам массива значения B(Black) или W(White). Результат работы программы:
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W
        //W B W B W B W B
        //B W B W B W B W

        char[][] chessboard = new char[8][8];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                char black = 'B';
                char white = 'W';
                if ((i + j) % 2 == 0) {
                    chessboard[i][j] = white;
                } else {
                    chessboard[i][j] = black;
                }
            }
        }

        for (int i = 0; i < chessboard.length; i++) {
            System.out.println();
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + " ");
            }
        }
    }
}
