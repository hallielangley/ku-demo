import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = null;
        int age = -1;

        // Get the user's name
        System.out.println("Hello! What is your name? ");
        Scanner nameIn = new Scanner(System.in);
        name = nameIn.next();
        System.out.println("Hi " + name + "!");

        // Get the user's age
        System.out.println("How old are you?");
        Scanner ageIn = new Scanner(System.in);
        age = ageIn.nextInt();
        System.out.println("That's neat, " + age + " is a good age.");
    }
}
