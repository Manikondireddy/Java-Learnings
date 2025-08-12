package JavaExamples.JAVATASKS;
import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class RetainAll 
{
    public static void main(String[] args)
     {
        ArrayList a1= new ArrayList<>();
        a1.add(54);
        a1.add("hello");
        a1.add('a');
        a1.add(true);
        ArrayList a2 = new ArrayList<>();
        a2.add(43);
        a2.add(34);
        a2.add("bye");
            System.out.println(a1);
            System.out.println(a2);
            System.out.println("------");
            a1.retainAll(a2);
            System.out.println(a1);
            System.out.println(a2);
        
    }
    
}
