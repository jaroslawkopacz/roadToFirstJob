package streamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Marek", 16000, Position.DEVELOPER));
        employees.add(new Employee("Piotr", 22000, Position.TECH_LEAD));
        employees.add(new Employee("Maciek", 14000, Position.RECRUITER));
        employees.add(new Employee("Krzysiek", 40000, Position.CEO));

        List<String> employees2 = new ArrayList<>();
        for (Employee employee: employees) {
            if(employee.getSalary() > 15000 && employee.getPosition() == Position.DEVELOPER || employee.getPosition() == Position.TECH_LEAD){
                employees2.add(employee.getName());
            }
        }

        System.out.println(employees2);

        List<Double> salaries = employees
                .stream()
                .filter(employee -> employee.getSalary() > 15000)
                .peek(employee -> System.out.println("Filtered by salaray: " + employee))
                .filter(employee -> employee.getPosition().isIt())
                .map(employee -> employee.getSalary())
                .collect(Collectors.toList());

        System.out.println(salaries);

        Optional<Double> reduce = salaries
                .stream()
                .reduce((d1, d2) -> d1 + d2);

        Double sumOfSalaries = reduce.orElse(0d);
        System.out.println(sumOfSalaries);

        Double maxSalary = salaries
                .stream()
                .max((Comparator.comparingDouble(o -> o)))
                .orElse(0d);

        System.out.println(maxSalary);

        long count = salaries
                .stream()
                .count();

        System.out.println(count);

    }
}
