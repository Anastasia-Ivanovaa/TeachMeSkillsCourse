package Lesson_7.TaskOne;

public class Circle extends Figure {
        private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        int area = (int) (Math.PI * (radius * radius));
        super.setArea(area);
    }

    public void calculateLength() {
        int length = (int) (2 * Math.PI * radius);
        super.setLength(length);
    }

    public void printInfo() {
        System.out.println("It's a Circle.");
        System.out.println("Radius: " + radius );
        super.printInfo();

    }
}
