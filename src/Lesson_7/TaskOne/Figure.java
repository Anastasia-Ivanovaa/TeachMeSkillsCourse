package Lesson_7.TaskOne;

public abstract class Figure {
    private int length;
    private int area;

    public Figure() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public abstract void calculateArea();

    public abstract void calculateLength();

    public void printInfo() {
        System.out.println("The length is " + length + "." + "\n" + "The area is " + area + "." + "\n");
    }

}
