import java.util.Scanner;

public class swithcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        // Get student marks using loop
        System.out.println("Enter marks for 5 students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        int choice;

        // Menu-driven loop using switch
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Display All Marks");
            System.out.println("2. Calculate Average");
            System.out.println("3. Find Highest Mark");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Student Marks:");
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("Student " + (i + 1) + ": " + marks[i]);
                    }
                    break;

                case 2:
                    int sum = 0;
                    for (int mark : marks) {
                        sum += mark;
                    }
                    double average = (double) sum / marks.length;
                    System.out.println("Average Marks: " + average);
                    break;

                case 3:
                    int highest = marks[0];
                    for (int i = 1; i < marks.length; i++) {
                        if (marks[i] > highest) {
                            highest = marks[i];
                        }
                    }
                    System.out.println("Highest Mark: " + highest);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
