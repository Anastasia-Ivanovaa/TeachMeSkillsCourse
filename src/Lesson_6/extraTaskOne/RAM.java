package Lesson_6.extraTaskOne;

public class RAM {
    private String name;
    private int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String printInfoRAM() {
        return name + " " + volume;
    }
}
