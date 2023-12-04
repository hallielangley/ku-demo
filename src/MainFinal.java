import javax.naming.InvalidNameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) throws FileNotFoundException {

        // EXAMPLE 1: "Throw it somewhere else."
        File file = new File("src/message.txt");
        Scanner message = new Scanner(file);
        System.out.println(message.nextLine());

        String name = null;
        int age = -1;

        // EXAMPLE 3: Throw it, and handle with a try-catch.
        System.out.println("Hello! What is your name? ");
        try {
            Scanner nameIn = new Scanner(System.in);
            name = nameIn.next();
            validateName(name);
        } catch (InvalidNameException e) {
            name = "[REDACTED]";
            System.out.println("**" + e.getMessage() + "**");
        }
        System.out.print("Hi " + name + "! ");

        // EXAMPLE 2: Handle it with a try-catch.
        System.out.println("How old are you?");
        while (true) {
            try {
                Scanner ageIn = new Scanner(System.in);
                age = ageIn.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Try again.");
            }
        }
        System.out.println("That's neat, " + age + " is a good age.");

    }

    static void validateName(String name) throws InvalidNameException {
        if (name.contains("profanity")) {
            // Throw an exception if the name contains profanity.
            throw new InvalidNameException("Name redacted for profanity.");
        }
    }

}