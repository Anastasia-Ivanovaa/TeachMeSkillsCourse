package Lesson_6.extraTaskOne;

public class ProgrammCheck {
    public static void main(String[] args) {

        Computer computerOne = new Computer(1000, "Lenovo IdeaPad Gaming 3 16IAH7");
        computerOne.printInfo1();

        RAM ram = new RAM("RAM", 8);
        HDD hdd = new HDD("HDD", 256, "внешний");

        if (hdd.getType() == null) {
            System.out.println("The type of HDD can be 'внешний' or 'внутренний'. Please try again.");
            return;
        }

        Computer computerTwo = new Computer(2000, "Macbook Pro 16 M2 Pro", ram, hdd);

        computerTwo.printInfo1();
    }
}
