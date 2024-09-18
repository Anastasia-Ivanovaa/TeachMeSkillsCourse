package Lesson_7.TaskOne;

import java.util.Random;

public class ProgrammFigures {
    public static void main(String[] args) {


        Figure[] figures = new Figure[5];
        double sumOfLength = 0;

        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.calculateLength();
            figure.calculateArea();
            figure.printInfo();
            int figureLength = figure.getLength();
            sumOfLength += figureLength;
        }
        System.out.println("The sum of all figures length is " + sumOfLength);
    }

    private static Figure getRandomFigure() {
        Random random = new Random();
        int flag = random.nextInt(3);
        int sideOne = random.nextInt(1, 100);
        int sideTwo = random.nextInt(1, 100);
        int sideThree = random.nextInt(1, 100);
        int radius = random.nextInt(1, 100);
        if (flag == 0) {
            return new Triangle(sideOne, sideTwo, sideThree);
        } else if (flag == 1) {
            return new Circle(radius);
        } else {
            return new Rectangle(sideOne, sideTwo);
        }
    }
}

