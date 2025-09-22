package JavaExamples.Monday;

import java.util.HashMap;
import java.util.Map;

public class Department {
        private int id;
    private String name;
    private double number;
public Department(int id, String name,double number) {
        this.id = id;
        this.name = name;
        this.number=number;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public double number()
    {
        return number;
    }


    public static void main(String[] args) {
       
        HashMap<Integer, Department> departments = new HashMap<>();

        departments.put(1, new Department(1, "Hr",33));
        departments.put(2, new Department(2, "Finance",88));
        departments.put(3, new Department(3, "IT",78));
        departments.put(4, new Department(4, "Marketing",7));
        departments.put(5, new Department(5, "Sales",56));
        for (Map.Entry<Integer, Department> entry : departments.entrySet()) {
            Department dept = entry.getValue();
            System.out.println("ID: " + dept.getId() + ", Name: " + dept.getName());
        }
    }
}








