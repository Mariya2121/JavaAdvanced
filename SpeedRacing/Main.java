package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double consumption = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, consumption);
            cars.put(model, car);
        }


        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] data = input.split("\\s+");

            String model = data[1];
            int kilometers = Integer.parseInt(data[2]);

            Car currentCar = cars.get(model);


            if (currentCar.hasFuel(kilometers)){
                currentCar.drive(kilometers);
            }
            else {
                System.out.println("Insufficient fuel for the drive");
            }


            input = scanner.nextLine();
        }

        cars.values().forEach(System.out::println);
    }
}
