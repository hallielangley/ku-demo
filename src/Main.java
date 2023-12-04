import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // EXAMPLE 1: "Throw it somewhere else."
        File file = new File("src/message.txt");
        Scanner message = new Scanner(file);
        System.out.println(message.nextLine());

        String name = null;
        int age = -1;

        // EXAMPLE 3: Bypass bad behaviour.
        System.out.println("Hello! What is your name? ");
        Scanner nameIn = new Scanner(System.in);
        name = nameIn.next();
        validateName(name);
        System.out.println("Hi " + name + "!");

        // EXAMPLE 2: Handle it with a try-catch.
        System.out.println("How old are you?");
        Scanner ageIn = new Scanner(System.in);
        age = ageIn.nextInt();
        System.out.println("That's neat, " + age + " is a good age.");
    }

    static void validateName(String name) {
        // Throw an exception if the name contains profanity.
    }
}