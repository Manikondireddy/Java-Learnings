package JavaExamples;
    import java.util.*;
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " : " + marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mani", 90));
        students.add(new Student("Mini", 75));
        students.add(new Student("Mahi", 85));
        Comparator<Student> sortByMarks = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.marks - s2.marks;
            }
        };
        Comparator<Student> sortByName = new Comparator<Student>()
         {
            public int compare(Student s1, Student s2) {
                return s1.name.compareTo(s2.name);
            }
        };

        Collections.sort(students, sortByMarks);
        System.out.println("Sorted by marks:");
        for (Student s : students) {
            System.out.println(s);
        }
        Collections.sort(students, sortByName);
        System.out.println("\nSorted by name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

    

