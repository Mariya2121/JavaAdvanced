package Google;

import javax.management.MBeanRegistration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Person> personMap = new HashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String personName = data[0];
            personMap.putIfAbsent(personName, new Person());


            switch (data[1]) {
                case "company":
                    String companyName = data[2];
                    String department = data[3];
                    double salary = Double.parseDouble(data[4]);

                    Company company = new Company(companyName, department, salary);
                    personMap.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = data[2];
                    String pokemonType = data[3];

                    Pokemon pokemon = new Pokemon(pokemonName, pokemonType);
                    personMap.get(personName).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String parentName = data[2];
                    String parentBirth = data[3];

                    Parent parent = new Parent(parentName, parentBirth);
                    personMap.get(personName).getParents().add(parent);
                    break;
                case "children":
                    String childName = data[2];
                    String childBirth = data[3];

                    Child child = new Child(childName,childBirth);
                    personMap.get(personName).getChildren().add(child);
                    break;
                case "car":
                    String model = data[2];
                    int speed = Integer.parseInt(data[3]);

                    Car car = new Car(model, speed);
                    personMap.get(personName).setCar(car);
                    break;
            }
            input = scanner.nextLine();
        }

        String printPerson = scanner.nextLine();

        System.out.println(printPerson);

        System.out.println(personMap.get(printPerson).toString());
    }
}
