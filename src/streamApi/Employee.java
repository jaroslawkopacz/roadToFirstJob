package streamApi;

import java.util.Objects;

public class Employee {
    private String name;
    private double salary;
    private Position position;

    public Employee(String name, double salary, Position position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, position);
    }
}
