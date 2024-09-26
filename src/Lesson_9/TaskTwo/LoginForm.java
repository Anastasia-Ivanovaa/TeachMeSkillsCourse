package Lesson_9.TaskTwo;

import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter login: ");
        String login = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        System.out.println("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        if (login(login, password, confirmPassword)) {
            System.out.println("You are successfully logged.");
        } else {
            System.out.println("You haven't logged.");
        }
    }

    public static boolean login(String login, String password, String confirmPassword) {

        String exceptionLogin = null;
        String exceptionPassword = null;

        try {
            if (login.length() > 20) {
                exceptionLogin = "The login cannot contain more than 20 characters. Please try again.";
            } else if (login.contains(" ")) {
                exceptionLogin = "The login cannot contain space(s). Please Try again. ";
            }

            if (password.length() > 20) {
                exceptionPassword = "The password cannot contain more than 20 characters. Please try again.";
            } else if (password.contains(" ")) {
                exceptionPassword = "The password cannot contain space(s). Please Try again.";
            } else if (!password.contains("1")) {
                exceptionPassword = "The password must contain '1'.";
            } else if (!password.equals(confirmPassword)) {
                exceptionPassword = "Passwords don't match, please try again.";
            }

            if (exceptionLogin != null) {
                WrongLoginException e = new WrongLoginException(exceptionLogin);
                throw e;
            } else if (exceptionPassword != null) {
                WrongPasswordException e = new WrongPasswordException(exceptionPassword);
                throw e;
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
