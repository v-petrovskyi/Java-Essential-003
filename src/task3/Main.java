package task3;

public class Main {
    public static void main(String[] args) {
        Vehicle ship = new Ship("W355 S354", 1855000, 50.5,1980,3000,"Odessa");
        Vehicle car = new Car("S865 W32", 12000, 320.5,2015);
        Vehicle plane =new Plane("S35 W46",200000,1200,2001,12000,230);

        System.out.println(ship);
        System.out.println(car);
        System.out.println(plane);
// done
    }
}
