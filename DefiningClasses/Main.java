package DefiningClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int count = Integer.parseInt(scanner.nextLine());
//
//        List<Car> cars = new ArrayList<>();
//
//        while (count-- > 0) {
//            String[] tokens = scanner.nextLine().split("\\s+");
//            String brand = tokens[0];
//
//            if (tokens.length == 1) {
//                Car car = new Car(brand);
//                cars.add(car);
//            } else {
//                String model = tokens[1];
//                int horsePower = Integer.parseInt(tokens[2]);
//                Car car = new Car(brand, model, horsePower);
//                cars.add(car);
//            }
//        }
//        cars.forEach(car -> System.out.println(car.toString()));


        String line = scanner.nextLine();
        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            String output = null;
            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                bankAccounts.put(id, bankAccount);
                output = "Account ID" + id + " created";
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(tokens[1]);
                int amount = Integer.parseInt(tokens[2]);

                BankAccount bankAccount = bankAccounts.get(id);
                if (bankAccount == null) {
                    System.out.println("Account does not exist");
                } else {
                    bankAccount.deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                }

            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);
            } else {
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);
                BankAccount bankAccount = bankAccounts.get(id);
                if (bankAccount != null) {
                    output = String.format("%.2f", bankAccount.getInterestRate(years));
                } else {
                    System.out.println("Account does not exist");
                }
            }

            if (output != null) {
                System.out.println(output);
            }
            line = scanner.nextLine();
        }

    }
}
