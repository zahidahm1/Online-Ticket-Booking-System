public class Main {
    public static void main(String[] args) {
        while (true) {
            LoginSignupPage loginSignupPage = new LoginSignupPage();
            loginSignupPage.display();
            
            // Ask user if they want to book another ticket or exit
            System.out.println("Do you want to book another ticket? (yes/no): ");
            String choice = InputReader.readInput();
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using the Online Ticket Booking System. Goodbye!");
                break;
            }
        }
    }
}
