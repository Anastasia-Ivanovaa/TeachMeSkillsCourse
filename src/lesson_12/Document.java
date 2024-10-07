package lesson_12;

public class Document {
    private String documentNumber;
    private String errorMessage = "";

    @Override
    public String toString() {
        return "Document{" +
                "documentNumber='" + documentNumber + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getErrorMessage() {
        return errorMessage.length() != 0 ? "Invalid document number." + errorMessage : "Valid document number.";
    }

    public boolean documentNumberValidation() {
        if (documentNumber.length() == 15 && documentNumber.startsWith("docnum")) {
            if (documentNumber.contains(" ")) {
                errorMessage = "The document number must NOT contain spaces.";
            }

        } else {
            if (documentNumber.length() > 15) {
                errorMessage = "The document number contains more than 15 characters.";

            } else if (documentNumber.length() < 15) {
                errorMessage = "The document number contains less than 15 characters.";
            } else if (!documentNumber.startsWith("AB100")) {
                errorMessage = "The document number must start with 'AB100'.";
            }
        }
        return errorMessage == null;
    }
}
