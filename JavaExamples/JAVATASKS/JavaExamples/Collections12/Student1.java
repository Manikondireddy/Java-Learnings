package JavaExamples.Collections12;
import java.util.ArrayList;
import java.util.List;

public class Student1 {
    
       private ArrayList<String> student = new ArrayList<>();
        
      public void addStudent(String name) {
        student.add(name);
     }
     public void removestudent(String name)
     {
        if(student.remove(name))
        {
            System.out.println("remove sucessfully :" + name);
        }
        else{
            System.out.println("not remove sucessfully : " + name);
        }
     }
     public void searchstudent(String name)
     {
        if(student.contains(name))
        {
            System.out.println("searching for name :" + name);
        }
        else{
            System.out.println("Not serching :" + name);
        }
     }
     public void displayStudent(String name)
     {
        System.out.println("final list : " + student);
        
        
     }
     public static void main(String[] args) {
        Student1 s= new Student1();
        s.addStudent("ravi");
        s.addStudent("kiran");
        s.addStudent("charan");
        s.addStudent("varun");
        s.addStudent("madhu");
        s.addStudent("tharun");;
        s.addStudent("dore");
        s.addStudent("mani");
        s.addStudent("milk");
        s.addStudent("dreama");
        s.displayStudent("mani");
        s.searchstudent("charan");
        s.removestudent("milk");
        s.displayStudent(null);
        
      

     }

    }
    

     
     

     
