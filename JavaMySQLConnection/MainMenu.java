import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Insert Student");
            System.out.println("2. Retrieve Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    InsertStudent.main(null);
                    break;
                case "2":
                    RetrieveStudent.main(null);
                    break;
                case "3":
                    UpdateStudent.main(null);
                    break;
                case "4":
                    DeleteStudent.main(null);
                    break;
                case "5":
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (!choice.equals("5"));

        scanner.close();
    }
}
