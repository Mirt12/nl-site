public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportcar.passengers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        System.out.println("Minivan can bring " + minivan.passengers + " to the distanse " + minivan.range() + " mils");
        System.out.println("Sportcar can bring " + sportcar.passengers + " to the distanse " + sportcar.range() + " mils");
    }
}
