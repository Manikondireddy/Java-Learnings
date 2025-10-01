package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;
    import java.util.*;
import java.util.stream.*;

public class StreamConcatExample {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("mani", "mini");
        List<String> list2 = Arrays.asList("mahi", "madhu");
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();
        Stream<String> combinedStream = Stream.concat(stream1, stream2);
        List<String> Result = combinedStream
                                .filter(name -> name.length() > 3) 
                                .collect(Collectors.toList());

        System.out.println("Combined Stream :" + Result);
    }
}


    

