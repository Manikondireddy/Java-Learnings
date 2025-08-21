package JavaExamples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collection 
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);
        numbers.add(88);
        System.out.println("Original list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);
    }
}  



    

