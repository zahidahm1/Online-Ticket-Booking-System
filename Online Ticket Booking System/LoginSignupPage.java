public class LoginSignupPage {
    private UserManager userManager = new UserManager();

    public void display() {
        System.out.println("Welcome to the Online Ticket Booking System");
        System.out.println("1. Login\n2. Signup");
        int choice = Integer.parseInt(InputReader.readInput());

        if (choice == 1) {
            userManager.login();
        } else if (choice == 2) {
            userManager.signup();
        } else {
            System.out.println("Invalid choice. Try again.");
            display();
        }

        new TransportSelectionPage().display();
    }
}
