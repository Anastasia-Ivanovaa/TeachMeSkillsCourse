package lesson_11;

import java.util.*;

public class DrinkTea {
    public static void main(String[] args) {

        String[] teaBagsTaste = {"Strawberry", "Cherry", "Mango"};

        Stack<TeaBag> teaBags = fillJar(teaBagsTaste);
        List<Employee> whoGotDrunk = new ArrayList<>();

        Deque<Employee> employeeQueue = new ArrayDeque<>();
        employeeQueue.add(new Employee("Sam"));
        employeeQueue.add(new Employee("Ann"));
        employeeQueue.add(new Employee("Kate"));
        employeeQueue.add(new Employee("Peter"));
        employeeQueue.add(new Employee("Jack"));


        while (!teaBags.isEmpty() && !employeeQueue.isEmpty()) {
            Employee e = employeeQueue.pop();

            if (e.desiredAmountOfTea != 0) {
                e.addHistory(teaBags.getLast());
                teaBags.removeLast();
                e.quantityOfDrankTea++;
                e.desiredAmountOfTea--;
            }
            if (e.desiredAmountOfTea == 0) {
                whoGotDrunk.add(e);
            } else {
                employeeQueue.addLast(e);
            }

        }

        System.out.println(employeeQueue);
        System.out.println(whoGotDrunk);
        System.out.println(teaBags);

    }

    public static Stack<TeaBag> fillJar(String[] types) {
        Random random = new Random();

        int quantityOfBags = random.nextInt(10, 20);
        Stack<TeaBag> teaBags = new Stack<>();

        for (int i = 0; i < quantityOfBags; i++) {
            int flag = random.nextInt(3);
            teaBags.push(new TeaBag(types[flag]));
        }
        return teaBags;
    }
}
