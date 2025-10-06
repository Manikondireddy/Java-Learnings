package JavaExamples.Tasks1234;
  import java.util.*;
import java.util.stream.Collectors;
class Employee {
    String name;
    double salary;
    String department;
    String city;
    public Employee(String name, double salary, String department, String city) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.city = city;
    }

    public double getSalary() 
    { 
        return salary; 
    }
    public String getDepartment() 
    {
         return department; 
    }
    public String getCity() 
    { 
        return city; 
    }

    @Override
    public String toString()
     {
        return name + " - " + salary + " - " + department + " - " + city;
    }
}
public class AvgSalarySimple {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("mani", 80000, "HR", "India"),
            new Employee("mini", 95000, "IT", "USA"),
            new Employee("mahi", 105000, "IT", "London"),
            new Employee("madhu", 78000, "HR", "New York"));
        Map<String, Double> avgSalaryMap = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.getDepartment() + "-" + e.getCity(),
                Collectors.averagingDouble(Employee::getSalary)
            ));
        System.out.println("Average Salary by Department and City:");
        avgSalaryMap.forEach((deptCity, avgSalary) ->
            System.out.println(deptCity + " -> " + avgSalary)
        );
    }
}

 





    

