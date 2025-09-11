package JavaExamples.Collections12;
import java.util.ArrayList;
import java.util.List;
public class List33 {
    ArrayList<String> students = new ArrayList<>();
  void addStudent(String name) {
        students.add(name);
     }

    
      void removeStudent(String name) {
         if (students.remove(name)) {
             System.out.println(name + " removed successfully.");
        } else {
            System.out.println(name + " not found.");
        }
     }

   
      void searchStudent(String name) {
       if (students.contains(name)) {
           System.out.println(name + " found in the list.");
        } else {
           System.out.println(name + " not found.");
        }
    }

     void displayStudents() {
        System.out.println("Student List: " + students);
     }

    public static void main(String[] args) {
         List33 sl = new List33();
         sl.addStudent("Ravi");
        sl.addStudent("Sita");
         sl.addStudent("Amit");
         sl.addStudent("Priya");
        sl.addStudent("Arjun");
        sl.addStudent("Kiran");
         sl.addStudent("Maya");
         sl.addStudent("Rahul");
         sl.addStudent("Neha");
        sl.addStudent("Varun");
         sl.displayStudents();
        sl.searchStudent("Priya");
        sl.removeStudent("Rahul");
        sl.displayStudents();
    }
}

    
        
         

        

   