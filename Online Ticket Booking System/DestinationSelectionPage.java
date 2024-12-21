public class DestinationSelectionPage {
    private int transportType;

    public DestinationSelectionPage(int transportType) {
        this.transportType = transportType;
    }

    public void display() {
        System.out.println("Enter Destination: ");
        String destination = InputReader.readInput();
        System.out.println("Enter Date (YYYY-MM-DD): ");
        String date = InputReader.readInput();

        new SeatAvailabilityPage(transportType, destination, date).display();
    }
}
