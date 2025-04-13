import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To take user input

        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // User input

        System.out.println("Multiplication Table for " + number + ":");

        // Loop to print table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
