package Lesson_2;

public class TaskEight {

    public static void main(String[] args) {

        int previousNumberOne = 0;
        int previousNumberTwo = 0;
        for (int i = 1; i <= 11; i++) {
            if (previousNumberOne != 0) {
                int sum = previousNumberOne + previousNumberTwo;
                System.out.print(sum + " ");
                previousNumberTwo = previousNumberOne;
                previousNumberOne = sum;
            } else {
                System.out.print(1 + " ");
                previousNumberOne = 1;
            }
        }
    }
}




