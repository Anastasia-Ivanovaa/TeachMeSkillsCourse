package Lesson_6.extraTaskOne;

public class HDD {
    private String name;
    private int volume;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("внешний") || type.equals("внутренний")) {
            this.type = type;
        }
    }

    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        setType(type);
    }

    public String printInfoHDD() {
        if (type == null) {
            return name + " " + volume;
        } else {
            return name + " " + volume + " " + type;

        }
    }
}
