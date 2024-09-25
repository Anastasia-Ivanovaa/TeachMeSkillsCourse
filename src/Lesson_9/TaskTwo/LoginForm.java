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

        if(login(login, password, confirmPassword)){
            System.out.println("You are successfully logged.");
        } else {
            System.out.println("You haven't logged.");
        }
    }

    public static boolean login(String login, String password, String confirmPassword) {

        try {
            WrongLoginException exceptionOne = new WrongLoginException("The login cannot contain more than 20 characters. Please try again.");
            if (login.length() > 20)
                throw exceptionOne;
            WrongLoginException exceptionTwo = new WrongLoginException("The login cannot contain space(s). Please Try again. ");
            if (login.contains(" "))
                throw exceptionTwo;
            WrongPasswordException exceptionThree = new WrongPasswordException("The password cannot contain more than 20 characters. Please try again.");
            if (password.length() > 20)
                throw exceptionThree;
            WrongPasswordException exceptionFour = new WrongPasswordException("The password cannot contain space(s). Please Try again.");
            if (password.contains(" "))
                throw exceptionFour;
            WrongPasswordException exceptionFive = new WrongPasswordException("The password must contain '1'.");
            if (!password.contains("1"))
                throw exceptionFive;
            WrongPasswordException exceptionSix = new WrongPasswordException("Passwords don't match, please try again.");
            if (!password.equals(confirmPassword))
                throw exceptionSix;
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
