package task3;

public class Plane extends Vehicle{
    int altitude;
    int passenger;
    Plane (String coordinates, int price, double speed, int year, int altitude, int passenger){
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.altitude=altitude;
        this.passenger=passenger;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plane{");
        sb.append("altitude=").append(altitude);
        sb.append(", passenger=").append(passenger);
        sb.append(", coordinates='").append(coordinates).append('\'');
        sb.append(", price=").append(price);
        sb.append(", speed=").append(speed);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
