package JavaExamples;
import java.util.LinkedHashSet;

public class HashSetexx23 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> num = new LinkedHashSet<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
    System.out.println("Number:" + num);
    num.remove(40);
    System.out.println("After removing :" + num);
    System.out.println("contains :" + num.contains(50));
    System.out.println("contains :" + num.contains(30));
    
    System.out.println("Iterationg loops :");
    
    for(int nums:num)
    {
        System.out.println(num);
    }
        System.out.println("total numbers: " + num.size());
}
}
    
        
    


    

