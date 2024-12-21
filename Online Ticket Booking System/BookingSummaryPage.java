public class BookingSummaryPage {
    private int transportType;
    private String destination;
    private String date;
    private int seat;
    private String name;
    private int age;
    private String contact;

    public BookingSummaryPage(int transportType, String destination, String date, int seat, String name, int age, String contact) {
        this.transportType = transportType;
        this.destination = destination;
        this.date = date;
        this.seat = seat;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public void display() {
        System.out.println("Booking Summary");
        System.out.println("Transport: " + (transportType == 1 ? "Flight" : transportType == 2 ? "Train" : "Bus"));
        System.out.println("Destination: " + destination);
        System.out.println("Date: " + date);
        System.out.println("Seat: " + seat);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact: " + contact);
        System.out.println("Thank you for booking with us!");

        // Add booking details to booking history
        String bookingDetails = "Transport: " + (transportType == 1 ? "Flight" : transportType == 2 ? "Train" : "Bus") +
                ", Destination: " + destination + ", Date: " + date + ", Seat: " + seat;
        TransportSelectionPage.bookingHistory.addBooking(bookingDetails);

        // Ask user if they want to book another ticket or exit
        System.out.println("Do you want to book another ticket? (yes/no): ");
        String choice = InputReader.readInput();
        if (choice.equalsIgnoreCase("yes")) {
            new TransportSelectionPage().display();
        } else {
            System.out.println("Thank you for using the Online Ticket Booking System. Goodbye!");
        }
    }
}
