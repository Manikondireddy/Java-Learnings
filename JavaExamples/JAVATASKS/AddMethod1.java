package JavaExamples.JAVATASKS;
import java.util.ArrayList;

public class AddMethod1 {
    public static void main(String[] args) 
    {
        ArrayList a= new ArrayList<>();
        a.add(27);
        a.add("false");
        a.add('a');
        a.add("hello");
        System.out.println(a);
        for(int i=0;i<a.size();i++)
        {
            System.err.println(a.get(i));
        }
        
    }
    
}
