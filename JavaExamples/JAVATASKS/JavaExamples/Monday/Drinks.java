package JavaExamples.Monday;
import java.util.ArrayList;


public class Drinks {

        private ArrayList<String> student= new ArrayList<>();
        public void addstudent(String name)
        {
            student.add(name);
            System.out.println("Adding the student name :" + name);
        }


        public void removestudent(String name)
        {
            if(student.remove(name))
            {
                System.out.println("removed successfully :" + name);
            }
            else{
                System.out.println("after removing student :" + name);
            }

        }
        public void searchstudent(String name)
        {
            if(student.contains(name))
            {
                System.out.println("searching sucessfully" + name);
            }
            else{
                System.err.println("found the name : "+ name);
            }
        }
    
    public static void main(String[] args) 
    {
        ArrayList a= new ArrayList<>();
        a.addstudent("mani");

        
        
    }
}

    

        

       
        
    
