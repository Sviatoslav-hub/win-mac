public class Bus {
    private int numberOfTheBus;
    private int busSeats;
    private String busOwner;
    private String busDirection;
    private double price;

    public Bus(int numberOfTheBus, int busSeats, String busOwner, String busDirection, double price) {
        this.numberOfTheBus = numberOfTheBus;
        this.busSeats = busSeats;
        this.busOwner = busOwner;
        this.busDirection = busDirection;
        this.price = price;
    }

    public Bus() {
    }

    public int getNumberOfTheBus() {
        return numberOfTheBus;
    }

    public void setNumberOfTheBus(int numberOfTheBus) {
        this.numberOfTheBus = numberOfTheBus;
    }

    public int getBusSeats() {
        return busSeats;
    }

    public void setBusSeats(int busSeats) {
        this.busSeats = busSeats;
    }

    public String getBusOwner() {
        return busOwner;
    }

    public void setBusOwner(String busOwner) {
        this.busOwner = busOwner;
    }

    public String getBusDirection() {
        return busDirection;
    }

    public void setBusDirection(String busDirection) {
        this.busDirection = busDirection;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfTheBus=" + numberOfTheBus +
                ", busSeats=" + busSeats +
                ", busOwner='" + busOwner + '\'' +
                ", busDirection='" + busDirection + '\'' +
                ", price=" + price +
                '}';
    }
}

