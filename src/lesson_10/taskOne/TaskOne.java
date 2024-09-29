package lesson_10.taskOne;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter document number in the following format xxxx-yyy-xxxx-yyy-xyxy: ");

        String docNumber = scanner.nextLine();

        System.out.println(StringParser.getTwoFirstNumberBlocks(docNumber));

        System.out.println(StringParser.changeCharacterToAsterisk(docNumber));

        System.out.println(StringParser.getOnlyLettersLowerCase(docNumber));

        System.out.println(StringParser.getOnlyLettersUpperCase(docNumber));

        String substring = "abc";
        if (StringParser.contains(docNumber, substring)) {
            System.out.println("The document number contains " + substring + ".");
        } else {
            System.out.println("The document number doesn't contain " + substring + ".");
        }

        String substringTwo = "555";
        if (StringParser.startsWith(docNumber, substringTwo)) {
            System.out.println("The document starts with " + substringTwo + ".");
        } else {
            System.out.println("The document number doesn't start with " + substringTwo + ".");
        }

        String substringThree = "1a2b";
        if (StringParser.endsWith(docNumber, substringThree)) {
            System.out.println("The document ends with " + substringThree + ".");
        } else {
            System.out.println("The document number doesn't end with " + substringThree + ".");
        }
    }
}

