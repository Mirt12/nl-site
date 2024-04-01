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

        int i = cars.size() - 1;
        cars.remove(i);
        System.out.println(cars.size());
        System.out.println("----------------");


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(205);
        numbers.add(-1);
        numbers.add(180);
        numbers.add(0);
        numbers.add(-180);

        int maxNumber = -2_147_483_647;
        for (int element : numbers) {
            if (element > maxNumber)
                maxNumber = element;
        }
        System.out.println(maxNumber);
    }
}
