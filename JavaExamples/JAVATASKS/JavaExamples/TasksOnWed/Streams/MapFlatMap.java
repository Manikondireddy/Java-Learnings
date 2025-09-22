package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {
    public static void main(String[] args) {
        List<String> numbers= Arrays.asList("hello","world!");
        List<Integer> lengths= numbers.stream()
                                    .map(String ::length)
                                    .collect(Collectors.toList());
                System.out.println("map() :" + lengths);

                
                List<String > length = numbers.stream()
                                                .flatMap(word -> Arrays.stream(word.split("")))
                                                .collect(Collectors.toList());
                                                System.out.println(" flatmap() :" + lengths);
        
    }
    
}
