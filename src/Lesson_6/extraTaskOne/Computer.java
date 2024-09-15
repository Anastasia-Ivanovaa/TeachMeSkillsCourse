package Lesson_6.extraTaskOne;

public class Computer {
    private double price;
    private String model;
    private RAM RAM;
    private HDD HDD;


    public Computer() {
        RAM = new RAM("ram", 256);
        HDD = new HDD("hdd", 156, "внешний");
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, RAM RAM, HDD HDD) {
        this(price, model);
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void printInfo1() {
        System.out.println("Computer model: " + model + "\n " + "Price: " + price + "$" + "\n");
    }

    public void printInfo2() {
        System.out.println("Computer model: " + model + " " + "Price: " + price + "$" + "\n" + RAM.printInfoRAM() + "\n" + HDD.printInfoHDD());
    }
}
