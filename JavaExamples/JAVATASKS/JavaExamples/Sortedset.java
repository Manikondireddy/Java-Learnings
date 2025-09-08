package JavaExamples;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;

public class Sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(60);
        numbers.add(20);
        numbers.add(30);
        numbers.add(80);
        numbers.add(50);
        numbers.add(10);
        numbers.add(70);
        numbers.add(40);
        System.out.println("Numbers (ascending) : " + numbers);
        System.out.println("first number : " + numbers.first());
        System.out.println("last numbers : " + numbers.last());
        numbers.remove(70);
        System.out.println("After removing :" + numbers);
        System.out.println("headset(>40) : " + numbers.headSet(40));
        System.out.println("tailset (60 <=) :" + numbers.tailSet(50));
        

        


            
        }
            
        }
            
        
