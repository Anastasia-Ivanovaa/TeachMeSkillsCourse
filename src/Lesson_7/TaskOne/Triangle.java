package Lesson_7.TaskOne;

public class Triangle extends Figure {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public void calculateArea() {
        int partialLength = (sideOne + sideTwo + sideThree) / 2;
        int area = (int) Math.sqrt(partialLength * (partialLength - sideOne) * (partialLength - sideTwo) * (partialLength - sideThree));
        super.setArea(area);
    }

    public void calculateLength() {
        int length = sideOne + sideTwo + sideThree;
        super.setLength(length);
    }

    @Override
    public void printInfo() {
        System.out.println("It's a Triangle. ");
        System.out.println("Side 1 = " + sideOne + " " + "Side 2 = " + sideTwo + " " + "Side 3 = " + sideThree);
        super.printInfo();
    }
}
