package JavaExamples.Collections12;
 import java.util.ArrayList;
 import java.util.List;
import java.util.Scanner;
public class Stu {
    private ArrayList<Integer> s = new ArrayList<>();
    public void adds(int name)
    {
        System.out.println("adding name sucessfully");
    }
}


    public void removes(int name)
    {
        if(s.remove("name"))
        {
            System.out.println("remove name sucessfully :" + name);
        }
        else{
            System.out.println("not remove sucessfully : " + name);
        }
    }
        public void searchs(int name)
        {
            if(s.contains(name))
            {
                System.out.println("serching  for name : " +  name);
            }
        
        else
        {
            System.out.println("not searching for name :" + name);

        }
    }
        
        public void displays(int name)
        {
            
                System.out.println("final student list "  + name);
        }
            
        
        
            public static void main(String[] args) {
                Stu s= new Stu();
                s.adds(23);
                s.adds(21);
                s.adds(56);
                s.adds(5);
                s.adds(15);
                s.adds(54);
                s.adds(78);
                s.adds(99);
                s.adds(12);
                s.adds(45);
                s.displays(21);
                s.removes(5);
                s.adds(89);
                s.displays(0);
            }


            
        
        
        
        
        
        
        
        
        
    

        
            
        

