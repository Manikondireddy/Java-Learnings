package JavaExamples.JAVATASKS;

   import java.util.ArrayList;
public class AddMethod
 {
    public static void main(String[] args) 
    {
        ArrayList a= new ArrayList<>();
        a.add(25);
        a.add("hello");
        a.add(true);
        a.add('a');
        a.add(null);
        a.add(879);
        System.out.println(a);
        a.remove(0);
        System.out.println(a);

        
        
    }
   

    
}
