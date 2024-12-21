public class TransportSelectionPage {
    public static final BookingHistory bookingHistory = new BookingHistory();

    public void display() {
        System.out.println("Select Type of Transport:");
        System.out.println("1. Flight\n2. Train\n3. Bus\n4. View Booking History");
        int choice = Integer.parseInt(InputReader.readInput());

        if (choice == 1 || choice == 2 || choice == 3) {
            new DestinationSelectionPage(choice).display();
        } else if (choice == 4) {
            bookingHistory.displayBookingHistory();
            display();  // Allow user to go back to transport selection
        } else {
            System.out.println("Invalid choice. Try again.");
            display();
        }
    }
}
