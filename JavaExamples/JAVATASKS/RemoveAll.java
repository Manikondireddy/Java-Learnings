package JavaExamples.JAVATASKS;
import java.util.ArrayList;

public class RemoveAll 
{
    public static void main(String[] args) 
    {
        ArrayList a1=new ArrayList<>();
        a1.add(23);
        a1.add("hello");
        a1.add(true);
        a1.add('a');
        ArrayList a2=new ArrayList<>();
        a2.add(56);
        a2.add("hi");
        a2.add(true);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("-----");
        a1.removeAll(a2);
        System.out.println(a1);
        System.out.println(a2);
        

            
    }
    
}
