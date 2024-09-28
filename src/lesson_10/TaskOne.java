package lesson_10;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document number in the following format xxxx-yyy-xxxx-yyy-xyxy: ");
        String docNumber = scanner.nextLine();

        String s = StringParser.getTwoFirstNumberBlocks(docNumber);
        System.out.println(s);
    }


}

