package Lesson_8.TaskTwo;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value (for example, 10 C): ");
        convert(scanner.nextDouble(), Type.valueOf(scanner.next()));
    }

    public static double convert(double value, Type type) {
        switch (type) {
            case C -> {
                double fahrenheit = Math.round(1.8 * value + 32);
                double kelvin = Math.round(value + 273.15);
                System.out.println(fahrenheit + " " + Type.F.getLetter() + "\n" + kelvin + " " + Type.K.getLetter());
            }
            case K -> {
                double celsius = Math.round(value - 273.15);
                double fahrenheit = Math.round(1.8 * celsius + 32);
                System.out.println(celsius + " " + "C" + "\n" + fahrenheit + " " + "F");
            }
            case F -> {
                double celsius = Math.round(value / 1.8 - 32);
                double kelvin = Math.round(celsius + 273.15);
                System.out.println(celsius + "C" + "\n" + kelvin + "K");
            }
            default -> {
                return 0;
            }
        }
        return value;
    }
}
