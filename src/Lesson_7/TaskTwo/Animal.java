package Lesson_7.TaskTwo;

public abstract class Animal {
    private static int nextId = 1;

    private long id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("I ate.");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    public void live() {
        eat();
    }
}


