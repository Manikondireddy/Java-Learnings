package JavaExamples.JAVATASKS;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(30);
        uniqueNumbers.add(10); 

        System.out.println("Unique numbers " + uniqueNumbers);
        System.out.println("Contains 20 " + uniqueNumbers.contains(20));
        System.out.println("Contains 50 " + uniqueNumbers.contains(50));
        uniqueNumbers.remove(30);
        System.out.println("Numbers after removing  " + uniqueNumbers);
    }
}
    

