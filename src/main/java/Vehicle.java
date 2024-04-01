public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range() {
        System.out.println("The length - " + fuelcap * mpg + " mils.");
    }
}
