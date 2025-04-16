import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentDiaryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "diary.txt";
        boolean running = true;

        while (running) {
            System.out.println("\n Student Diary Menu:");
            System.out.println("1. Add new entry");
            System.out.println("2. View entries");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print(" Write your diary entry: ");
                    String entry = scanner.nextLine();
                    try {
                        FileWriter writer = new FileWriter(fileName, true);
                        writer.write(entry + "\n");
                        writer.close();
                        System.out.println(" Entry saved!");
                    } catch (IOException e) {
                        System.out.println(" Error writing to file: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        File file = new File(fileName);
                        Scanner fileReader = new Scanner(file);
                        System.out.println("\n--- Your Diary Entries ---");
                        while (fileReader.hasNextLine()) {
                            String line = fileReader.nextLine();
                            System.out.println(line);
                        }
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(" Error reading file: " + e.getMessage());
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println(" Exiting... Goodbye!");
                    break;

                default:
                    System.out.println(" Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
