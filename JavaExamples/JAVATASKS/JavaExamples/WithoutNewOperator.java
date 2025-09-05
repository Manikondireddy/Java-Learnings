package JavaExamples;
    class Student {
    int id;
    String name;

    public Student() {
        id = 101;
        name = "Rahul";
        System.out.println("Student object created!");
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class WithoutNewOperator {
    public static void main(String[] args) {
        try {
            Student s = Student.class.newInstance();

            s.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    

