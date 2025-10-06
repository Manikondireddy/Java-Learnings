package JavaExamples.Tasks1234;


import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    double salary;
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}

public class Highestsalary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Mani", 80000, "Engineering"),
            new Employee("Mini", 95000, "IT"),
            new Employee("Mahi", 105000, "IT"),
            new Employee("Mouni", 78000, "Finance"));
        Map<String, Employee> highestPaidByDept = employees.stream()
            .collect(Collectors.toMap(
                Employee::getDepartment,                
                e -> e,                                  
                (emp1, emp2) -> emp1.getSalary() > emp2.getSalary() ? emp1 : emp2));
        System.out.println("Highest-paid employee in each department:");
        highestPaidByDept.forEach((dept, emp) -> 
            System.out.println(dept + " --------- " + emp));
    }
}




