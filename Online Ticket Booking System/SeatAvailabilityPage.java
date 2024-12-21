public class SeatAvailabilityPage {
    private int transportType;
    private String destination;
    private String date;

    public SeatAvailabilityPage(int transportType, String destination, String date) {
        this.transportType = transportType;
        this.destination = destination;
        this.date = date;
    }

    public void display() {
        System.out.println("Available Seats: 1, 2, 3, 4, 5");
        System.out.print("Select a seat: ");
        int seat = Integer.parseInt(InputReader.readInput());

        new BookingDetailsPage(transportType, destination, date, seat).display();
    }
}
