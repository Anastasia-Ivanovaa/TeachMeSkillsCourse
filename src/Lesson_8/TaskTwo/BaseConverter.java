package Lesson_8.TaskTwo;

public class BaseConverter {
    public double convert(double value, Type type) {
        switch (type) {
            case CELSIUS -> {
                return value;
            }
            case KELVIN -> {
                return value + 273.15;
            }
            case FAHRENHEIT -> {
                return 1.8 * value + 32;
            }
            default ->
            {
                return 0;
            }
        }


    }
}
