package Lesson_8.TaskTwo;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value (for example, 10 C): ");
        convert(scanner.nextDouble(), Type.valueOf(scanner.next()));
    }

    public static String convert(double value, Type type) {
        switch (type) {
            case C -> {
                double fahrenheit = 1.8 * value + 32;
                double kelvin = value + 273.15;
                String result = fahrenheit + " " + Type.F.getLetter() + "\n" + kelvin + " " + Type.K.getLetter();
                return result;
            }
            case K -> {
                double celsius = value - 273.15;
                double fahrenheit = 1.8 * celsius + 32;
                String result = celsius + " " + "C" + "\n" + fahrenheit + " " + "F";
                return result;
            }
            case F -> {
                double celsius = value / 1.8 - 32;
                double kelvin = celsius + 273.15;
                String result = celsius + "C" + "\n" + kelvin + "K";
                return result;
            }
        }
        return "";
    }
}
