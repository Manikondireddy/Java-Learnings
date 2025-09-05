package JavaExamples;

public class UsingConstructor {
    
    int student_id;
    String student_name;
    String student_section;
    public UsingConstructor(int id, String name, String section) {
        student_id = id;
        student_name = name;
        student_section = section;
    }
    public void display() {
        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Student Section: " + student_section);
    }
    public static void main(String[] args) {
        UsingConstructor  u1 = new UsingConstructor(101, "mani", "A");
         UsingConstructor s2 = new UsingConstructor(102, "mini", "B");
        u1.display();
        System.out.println("--------------------");
        s2.display();
    }
}

    

