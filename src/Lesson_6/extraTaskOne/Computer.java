package Lesson_6.extraTaskOne;

public class Computer {
    private double price;
    private String model;
    private RAM ram;
    private HDD hdd;

    public Computer() {
        ram = new RAM("ram", 256);
        hdd = new HDD("hdd", 156, "внешний");
    }

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(double price, String model, RAM RAM, HDD HDD) {
        this(price, model);
        this.ram = RAM;
        this.hdd = HDD;
    }

    public void printInfo1() {
        String str = "Computer model: " + model + "\n " + "Price: " + price + "$";
        if(ram != null) {
            str += "\n" + ram.printInfoRAM();
        }
        if(hdd != null){
            str += "\n" + hdd.printInfoHDD();
        }
        System.out.println(str);
    }
  }
