package task3;

public class Ship extends Vehicle {
    int passenger;
    String port;

    Ship(String coordinates, int price, double speed, int year, int passenger, String port) {
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.passenger = passenger;
        this.port = port;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ship{");
        sb.append("passenger=").append(passenger);
        sb.append(", port='").append(port).append('\'');
        sb.append(", coordinates='").append(coordinates).append('\'');
        sb.append(", price=").append(price);
        sb.append(", speed=").append(speed);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
