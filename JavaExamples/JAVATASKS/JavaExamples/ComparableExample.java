package JavaExamples;
    import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public int compareTo(Student s) {
        return this.marks - s.marks; 
    }

    public String toString() {
        return name + " : " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mani", 90));
        students.add(new Student("Mini", 75));
        students.add(new Student("Mahi", 85));

        Collections.sort(students); 

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

    

