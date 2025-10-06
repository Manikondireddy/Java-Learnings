package JavaExamples.Tasks1234;
    import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    List<String> skills;

    public Employee(String name, String department, List<String> skills) {
        this.name = name;
        this.department = department;
        this.skills = skills;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + skills;
    }
}

public class Department{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("mani", "HR", Arrays.asList("Recruitment", "Communication")),
            new Employee("mini", "IT", Arrays.asList("Java", "SQL")),
            new Employee("mahi", "IT", Arrays.asList("Java", "Python")),
            new Employee("madhu", "HR", Arrays.asList("Payroll", "Communication")));
        Map<String, Set<String>> deptSkills = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,                      
                Collectors.flatMapping(
                    e -> e.getSkills().stream(),            
                    Collectors.toSet())));                     
                
        System.out.println("Department -> Distinct Skills:");
        deptSkills.forEach((dept, skills) -> 
            System.out.println(dept + " -> " + skills));
        
    }
}

    

