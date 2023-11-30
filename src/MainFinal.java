import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        String name = null;
        int age = -1;

        // Get the user's name
        System.out.println("Hello! What is your name? ");
        try {
            Scanner nameIn = new Scanner(System.in);
            name = nameIn.next();
            validateName(name);
        } catch (BadNameException e) {
            name = "[REDACTED]";
            System.out.println("**" + e.getMessage() + "**");
        }
        System.out.print("Hi " + name + "! ");

        // Get the user's age
        System.out.println("How old are you?");
        while (true) {
            try {
                Scanner ageIn = new Scanner(System.in);
                age = ageIn.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Are you sure that was an age? Try again.");
            }
        }
        System.out.println("That's neat, " + age + " is a good age.");

    }

    static void validateName(String name) throws BadNameException {
        if (name.equals("bad")) {
            throw new BadNameException("Name redacted for profanity.");
        }
    }

    static class BadNameException extends Exception {

        public BadNameException(String message) {
            super(message);
        }
    }
}