package Lesson_9.TaskOne;

public enum UserAction {
    EAT(1, "All animals can EAT."),
    SAY(2, "Cat, Dog and Parrot can SAY."),
    WALK(3, "Dog can be WALKED"),
    SWIM(4, "Fish can SWIM."),
    FLY(5, "Raven and Parrot can FLY."),
    EXIT(6,"Finish");

    private final int code;
    private final String description;

    UserAction(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static UserAction valueof(int code) {
        UserAction[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].code == code) {
                return values[i];
            }
        }
        System.out.println("Code was incorrect");
        return null;
    }
}
