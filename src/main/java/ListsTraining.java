import java.util.ArrayList;
import java.util.Collections;

public class ListsTraining {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Peugeot");
        cars.add("Mercedes");
        cars.add("Audio");
        System.out.println(cars);
        System.out.println(cars.size());

        for (String i : cars
        ) {
            System.out.println("This cars is the best! " + i);
        }

        Collections.sort(cars);
        System.out.println(cars);

        int i = cars.size() -1;
        cars.remove(i);
        System.out.println(cars.size());
    }
}
