package Lesson_8.TaskOne;

public class ProgrammPhone {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("Samsung S20", 163.0, "+375 29 123 45 67");
        Phone phoneTwo = new Phone("Xiaomi Redmi Note 5", 181, "+375 44 963 85 27");
        Phone phoneThree = new Phone("Iphone 15 Pro", 187, "+375 29 741 25 89");

        Phone[] phones = {phoneOne, phoneTwo, phoneThree};
        for (Phone phone : phones) {
            phone.printInfo();
            phone.receiveCall("Steve");
            System.out.println(phone.getNumber() + "\n");
        }

        phoneOne.receiveCall("Samantha", "+375 44 112 55 36");

        phoneOne.sendMessage("+375 29 563 25 52");
    }
}
