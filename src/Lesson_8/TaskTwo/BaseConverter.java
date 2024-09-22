package Lesson_8.TaskTwo;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value (for example, 10 C): ");
        String result = convert(scanner.nextDouble(), Type.valueOf(scanner.next()));
        System.out.println(result);
    }

    public static String convert(double value, Type type) {
        String result = "";
        switch (type) {
            case C -> {
                double fahrenheit = 1.8 * value + 32;
                double kelvin = value + 273.15;
                result = fahrenheit + " " + Type.F.name() + "\n" + kelvin + " " + Type.K.name();
            }
            case K -> {
                double celsius = value - 273.15;
                double fahrenheit = 1.8 * celsius + 32;
                result = celsius + " " + Type.C.name() + "\n" + fahrenheit + " " + Type.F.name();

            }
            case F -> {
                double celsius = value / 1.8 - 32;
                double kelvin = celsius + 273.15;
                result = celsius + Type.C.name() + "\n" + kelvin + Type.K.name();
            }
        }
        return result;
    }
}
