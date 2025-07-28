package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;

public class Student {
    String name;
    int age;
    String course;
    public Student() {
        this("Mani", 0, "AI");
    }
    public Student(String name, int age) {
        this(name, age, "ML");
    }
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("undefined ", 21);
        Student s3 = new Student("Mahi", 25, "Java");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}
    

