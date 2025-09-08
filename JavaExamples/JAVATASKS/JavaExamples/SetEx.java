package JavaExamples;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<String> fruit= new HashSet<>();
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("pineapple");
        fruit.add("apple");
        System.out.println("fruits :" + fruit );
        System.out.println("first fruit : " + fruit.contains("mango"));
        System.out.println("first fruit: "  + fruit.contains("grapes"));
        fruit.remove("apple");
        System.out.println("After removing :" + fruit);
           System.out.println("Iterating Fruits:");
        for(String fruits:fruit)
        {
            System.out.println(fruit);
        }
        System.out.println("Total Fruits: " + fruit.size());
    }
}



            


            
        
