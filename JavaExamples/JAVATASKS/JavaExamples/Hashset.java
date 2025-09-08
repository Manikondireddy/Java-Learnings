package JavaExamples;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) 
    {
HashSet<Integer> numbers= new HashSet<>();
   numbers.add(10);
   numbers.add(20);
   numbers.add(30);
   numbers.add(40);
   numbers.add(50);
   numbers.add(60);
   System.out.println("Numbers :" + numbers);
   System.out.println("Numbers contains :" + numbers.contains(40));
   numbers.remove(50);
   System.out.println("After removing : " + numbers);
   for(int num : numbers)
   {
    System.out.println(num);
    
   }
   System.out.println("size of hashset : " + numbers.size());
        
    }
    
}
