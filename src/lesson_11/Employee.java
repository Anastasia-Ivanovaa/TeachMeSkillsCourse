package lesson_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Employee {
    public static long nextId = 1;
    private final long id;
    private final String name;
    public int quantityOfDrankTea;
    public int desiredAmountOfTea;
    public List<TeaBag> history;


    public Employee(String name) {
        Random random = new Random();
        this.id = nextId++;
        this.name = name;
        this.desiredAmountOfTea = random.nextInt(0, 5);
        history = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHistory(TeaBag tea) {
        history.add(tea);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityOfDrankTea=" + quantityOfDrankTea +
                ", desiredAmountOfTea=" + desiredAmountOfTea +
                ", history=" + history +
                '}';
    }
}
