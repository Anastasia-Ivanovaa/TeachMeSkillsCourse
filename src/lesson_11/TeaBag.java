package lesson_11;


public class TeaBag {
    public String teaTaste;

    public TeaBag() {
    }

    public TeaBag(String teaTaste) {
        this.teaTaste = teaTaste;
    }

    @Override
    public String toString() {
        return "TeaBag{" +
                "teaTaste='" + teaTaste + '\'' +
                '}';
    }
}
