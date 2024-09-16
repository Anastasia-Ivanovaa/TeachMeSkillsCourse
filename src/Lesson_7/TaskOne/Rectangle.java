package Lesson_7.TaskOne;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public void calculateArea() {
        int area = sideOne * sideTwo;
        super.setArea(area);
    }

    public void calculateLength() {
        int length = sideOne * 2 + sideTwo * 2;
        super.setLength(length);
    }

    public void printInfo() {
        System.out.println("It's a Rectangle. ");
        System.out.println("Side 1 = " + sideOne + " " + "Side 2 = " + sideTwo );
       super.printInfo();

    }

}
