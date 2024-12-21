import java.util.ArrayList;

public class BookingHistory {
    private ArrayList<String> bookingHistory = new ArrayList<>();
    private String currentBooking = "";

    public void addBooking(String bookingDetails) {
        this.currentBooking = bookingDetails;
        bookingHistory.add(bookingDetails);
    }

    public void displayBookingHistory() {
        if (bookingHistory.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Booking History:");
            for (String booking : bookingHistory) {
                System.out.println(booking);
            }
            // Display the most recent booking as well
            System.out.println("Most recent booking: " + currentBooking);
        }
    }
}
