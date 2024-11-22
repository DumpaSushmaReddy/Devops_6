import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        // Predefined username and password
        String correctUsername = "user123";
        String correctPassword = "password";

        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for username and password
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if entered credentials match predefined ones
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Sign-in successful. Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Close scanner
        scanner.close();
    }
}
