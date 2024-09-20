package Lesson_8.TaskTwo;

public enum Type {
    C("C"),
    F("F"),
    K("K");

    private final String letter;

    public String getLetter() {
        return letter;
    }

    Type(String letter) {
        this.letter = letter;
    }


}
