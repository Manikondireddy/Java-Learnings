package JavaExamples.TasksOnWed.Streams;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(2,3,4,6,7,8,1);
        numbers.stream()
        .filter(n -> n % 2==0)
        .forEach(System.out::println);
        


    }

   
}
        
       
