package JavaExamples.JAVATASKS;
import java.util.ArrayList;

public class ContainAll
 {
    public static void main(String[] args) 
    {
        ArrayList a1= new ArrayList<>();
        a1.add("hello");
        a1.add('a');
        a1.add(false);
        a1.add(24);
        ArrayList a2 = new ArrayList<>();
        a2.add("hi");
        a2.add(true);
        a2.add("hello");
        a2.add('b');
        System.err.println(a1);
        System.out.println(a2);
        System.out.println("--------");
        System.out.println();
    }
}


        


    

