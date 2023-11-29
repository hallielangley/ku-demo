import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Get the user's name
        System.out.println("Hello! What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        // Get the user's age
        System.out.println("Hi " + name + "! How old are you?");
        Scanner ageIn = new Scanner(System.in);
        int age = ageIn.nextInt();
        System.out.println("That's neat, " + age + " is a good age.");
    }
}
