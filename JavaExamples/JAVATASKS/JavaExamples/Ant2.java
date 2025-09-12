package JavaExamples;
 import java.util.ArrayList;
class Ant2
{

    static ArrayList<String> students = new ArrayList<>();
    public static void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added to the list.");
    }
    public static void removeStudent(String name) {
        if (students.remove(name)) {
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }
    public static void searchStudent(String name) {
        if (students.contains(name)) {
            System.out.println(name + " found in the list.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }

    public static void main(String[] args) {
        addStudent("Naga");
        addStudent("Priya");
        addStudent("Sreeja");
        addStudent("Pandu");
        addStudent("Anil");
        addStudent("Niharika");
        addStudent("Ravi");
        addStudent("Kiran");
        addStudent("Deepak");
        addStudent("Mani");

        System.out.println("All Students: " + students);
        removeStudent("Pandu");
        System.out.println("After removal: " + students);
        searchStudent("Sreeja");
        searchStudent("Arjun");
    }
}









