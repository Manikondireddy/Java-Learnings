package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;
import java.util.List;

public class PrimeorNot {
    public static void main(String[] args) {
        List<Integer> res= Arrays.asList(2,3,4,5,8,98,12,33);
        boolean numbers= res.stream()
        .anyMatch(n-> n >1 && java.util.stream.IntStream.rangeClosed(2,(int)Math.sqrt(n))
        .allMatch(i->n% i!=0));
        System.out.println("average number :" + numbers);
        
    }
    
}
