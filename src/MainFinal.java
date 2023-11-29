import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFinal {
    public static void main(String[] args) {
        // Get the user's name
        System.out.println("Hello! What is your name? ");
        String name = "";
        try {
            Scanner input = new Scanner(System.in);
            name = input.next();

            if (name.equals("badword")) {
                throw new BadNameException();
            }

            System.out.print("It's nice to meet you " + name + "! ");
        } catch (BadNameException e) {
            System.out.print("That's not a nice name, but moving on... ");
        }

        // Get the user's age
        System.out.println("How old are you?");
        int age = -1;
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

    static class BadNameException extends Exception {

    }
}