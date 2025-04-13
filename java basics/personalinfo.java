import java.util.Scanner;  // Import Scanner for input

public class personalinfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object

        // Ask for name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Display the details
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        input.close();  // Close the Scanner
    }
}
