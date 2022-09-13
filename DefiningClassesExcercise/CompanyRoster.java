package DefiningClassesExcercise;

import java.util.*;

public class CompanyRoster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> employeeList = new ArrayList<>();

        List<Department> departmentList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];

            Employee employee = null;

            switch (data.length) {
                case 4: // no email; no age
                    employee = new Employee(name, salary, position, department);
                    employeeList.add(employee);
                    break;
                case 6: // have email and age
                    String email = data[4];
                    int age = Integer.parseInt(data[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    employeeList.add(employee);
                    break;
                case 5: // nor email, neither age
                    if (data[4].matches("\\d+")) {
                        int personAge = Integer.parseInt(data[4]);
                        employee = new Employee(name, salary, position, department, personAge);
                    } else {
                        String personEmail = data[4];
                        employee = new Employee(name, salary, position, department, personEmail);
                    }
                    break;
            }
          boolean departmentExists = departmentList.stream().filter(dep -> dep.getName().equals(department)).count() >= 1;
            if (!departmentExists){
                departmentList.add(new Department(department));
            }
            Department currentDep = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDep.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentList.stream().max(Comparator.comparingDouble(e -> e.averageSalary()))
                .get();

        System.out.printf("Highest Average Salary: %s%n",highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> (Double.compare(e2.getSalary(),e1.getSalary()))).forEach(System.out::println);
    }
}
