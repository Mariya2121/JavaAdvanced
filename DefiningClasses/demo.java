package DefiningClasses;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

         Scanner scanner =  new Scanner(System.in);

        // Save data for car which is white and has 1000 km

        String color = "while";
        int mileage = 1000;

        int distanceToAdd = Integer.parseInt(scanner.nextLine());
        mileage += distanceToAdd;

        System.out.println(mileage);


    }
}
