import java.util.HashMap;

public class UserManager {
    private HashMap<String, String> users = new HashMap<>();

    public void signup() {
        System.out.println("Signup Page");
        System.out.print("Enter username: ");
        String username = InputReader.readInput();
        System.out.print("Enter password: ");
        String password = InputReader.readInput();

        users.put(username, password);
        System.out.println("Signup successful! Please login.");
        login();
    }

    public void login() {
        System.out.println("Login Page");
        System.out.print("Enter username: ");
        String username = InputReader.readInput();
        System.out.print("Enter password: ");
        String password = InputReader.readInput();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Try again.");
            login();
        }
    }
}
