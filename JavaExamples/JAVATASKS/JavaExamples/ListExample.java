package JavaExamples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args)
    {
        List<String> fruits= new ArrayList<>();
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("jackfruit");
        fruits.add("mango");
        System.out.println("first fruit" + fruits.get(0));
        for(String fruit :fruits)
        {
            System.out.println(fruit);
            fruits.remove("pineapple");
        }
        System.out.println("removing an pineapple" + fruits);

    }
}

        

    
     
 
