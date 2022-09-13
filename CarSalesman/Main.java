package CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int enginesCount = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < enginesCount; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String engineModel = data[0];
            int enginePower = Integer.parseInt(data[1]);

            Engine engine = null;

            switch (data.length) {
                case 4:
                    String displacement = data[2];
                    String efficiently = data[3];
                    engine = new Engine(engineModel, enginePower, displacement, efficiently);
                    engines.put(engineModel, engine);
                    break;
                case 3:
                    String type = data[2];
                    engine = new Engine(engineModel, enginePower, type);
                    engines.put(engineModel, engine);
                    break;

                case 2:
                    engine = new Engine(engineModel, enginePower);
                    break;
            }
            engines.put(engineModel, engine);
        }

        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < carsCount; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            String engine = data[1];

            Car car = null;

            Engine existingEngine = engines.get(engine);

            switch (data.length) {
                case 4:
                    String weight = data[2];
                    String color = data[3];
                    car = new Car(model, existingEngine, weight, color);
                    break;

                case 3:
                    String type = data[2];
                    car = new Car(model, existingEngine, type);
                    break;

                case 2:
                    car = new Car(model, existingEngine);
                    break;

            }
            cars.add(car);
        }

        cars.forEach(System.out::println);
    }
}
