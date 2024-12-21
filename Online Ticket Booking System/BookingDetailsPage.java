public class BookingDetailsPage {
    private int transportType;
    private String destination;
    private String date;
    private int seat;

    public BookingDetailsPage(int transportType, String destination, String date, int seat) {
        this.transportType = transportType;
        this.destination = destination;
        this.date = date;
        this.seat = seat;
    }

    public void display() {
        System.out.println("Enter Passenger Details:");
        System.out.print("Name: ");
        String name = InputReader.readInput();
        System.out.print("Age: ");
        int age = Integer.parseInt(InputReader.readInput());
        System.out.print("Contact Number: ");
        String contact = InputReader.readInput();

        new PaymentGatewayPage(transportType, destination, date, seat, name, age, contact).display();
    }
}
