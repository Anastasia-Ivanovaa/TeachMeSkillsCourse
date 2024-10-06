package lesson_12;

import java.util.*;

public class DocumentReport {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> documents = new HashMap<>();

        String documentNumber = "";
        while (!documentNumber.equals("0")) {
            System.out.println("Enter the document number: ");
            documentNumber = scanner.nextLine();
            if (documentNumber.equals("0")) {
                break;
            }
            if (documents.containsKey(documentNumber)) {
                System.out.println("There is a document with such number in the list.");
                continue;
            }
            Document document = new Document();
            document.setDocumentNumber(documentNumber);

            document.documentNumberValidation();
            documents.put(document.getDocumentNumber(), document.getErrorMessage());
        }
        System.out.println("Finished!");

        for (Map.Entry<String, String> i : documents.entrySet()) {
            System.out.printf("Document number: %s Message: %s \n", i.getKey(), i.getValue());
        }
        scanner.close();
    }
}
