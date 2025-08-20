package JavaExamples;
import java.util.Vector;

public class Sample1 {
    public static void main(String[] args)
     
    {
        Vector v= new Vector<>();

        v.add(10);
        v.add(null);
        v.add(10);
        System.out.println(v);
        System.out.println(v.capacity());


        
    }
    
}
