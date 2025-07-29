
abstract class Employees {
    
    abstract void work();
    void attendMeeting() {
        System.out.println("Attending meeting");
    }
}
class Intern extends Employees {
    void work() {
        System.out.println("What does an intern do");
    }
}
class Manager extends Employees {
    void work() {
        System.out.println("giving tasks to the employees!");
    }
}
class Developer extends Employees {
    void work() {
        System.out.println("developer develops the code");
    }
}
 public class Employee {
    public static void main(String[] args) {
        Employees[] employees = {new Intern(),new Manager(),new Developer()};
            for (Employees e : employees) {
            e.attendMeeting();
            e.work();
        System.out.println(" ");

    
}
    }
}
