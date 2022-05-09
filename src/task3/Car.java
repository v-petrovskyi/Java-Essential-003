package task3;

public class Car extends Vehicle{
    Car(String coordinates, int price, double speed, int year){
        this.coordinates = coordinates;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("coordinates='").append(coordinates).append('\'');
        sb.append(", price=").append(price);
        sb.append(", speed=").append(speed);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
