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
        return name + " - " + salary;
    }
}

public class Topn {
    public static void main(String[] args) {
        int N = 2; 
        List<Employee> employees = Arrays.asList(
            new Employee("mani", 80000, "HR"),
            new Employee("mini", 95000, "IT"),
            new Employee("mahi", 105000, "IT"),
            new Employee("madhu", 78000, "HR"));
        Map<String, List<Employee>> groupedByDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));
        Map<String, List<Employee>> topSalariesByDept = new HashMap<>();

        for (Map.Entry<String, List<Employee>> entry : groupedByDept.entrySet()) {
            List<Employee> topList = entry.getValue().stream()
                    .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())) 
                    .limit(N)
                    .collect(Collectors.toList());
            topSalariesByDept.put(entry.getKey(), topList);
        }
        System.out.println("Top " + N + " salaries per department:");
        topSalariesByDept.forEach((dept, emps) -> {
            System.out.println(dept + " -> " + emps);
        });
    }
}
