public class PaymentGatewayPage {
    private int transportType;
    private String destination;
    private String date;
    private int seat;
    private String name;
    private int age;
    private String contact;

    public PaymentGatewayPage(int transportType, String destination, String date, int seat, String name, int age, String contact) {
        this.transportType = transportType;
        this.destination = destination;
        this.date = date;
        this.seat = seat;
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public void display() {
        System.out.println("Payment Gateway");
        System.out.println("Amount: ₹100");
        System.out.print("Enter payment details to proceed: ");
        String paymentDetails = InputReader.readInput();

        System.out.println("Payment Successful!");
        new BookingSummaryPage(transportType, destination, date, seat, name, age, contact).display();
    }
}
