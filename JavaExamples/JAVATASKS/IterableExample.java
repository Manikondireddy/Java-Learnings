package JavaExamples.JAVATASKS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) 
    {
List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using Iterator directly:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println("\nIterating using forEach() method (Java 8+):");
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}

