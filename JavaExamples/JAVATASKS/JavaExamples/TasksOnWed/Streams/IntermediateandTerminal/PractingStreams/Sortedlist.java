package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sortedlist {
    public static void main(String[] args) {
    List<Integer> num1= Arrays.asList(1,2,3,6,5,0);
    List<Integer>num2=Arrays.asList(7,9,4,67,30,50);
    List<Integer> sor=Stream.concat(num1.stream(), num2.stream())
    .sorted()
    .collect(Collectors.toList());
    System.out.println("merged list :" + sor);

}
}
