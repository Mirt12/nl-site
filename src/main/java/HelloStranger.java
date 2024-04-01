import java.util.ArrayList;
import java.util.Scanner;

public class HelloStranger {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int amountOfPeople = scan.nextInt();

        if (amountOfPeople == 0) {
            System.out.println("It seems that there are no people");
        }

        if (amountOfPeople < 0) {
            System.out.println("Why negative amount of people?");
        }

        for (int i = 1; i < amountOfPeople; i++) {
            Scanner scan2 = new Scanner(System.in);
            names.add(scan2.nextLine());
        }

        for (String i : names
        ) {
            System.out.println("Hoi! " + i);
        }
    }
}
