import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform basic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }

        sc.close(); // Close the scanner
    }
}
