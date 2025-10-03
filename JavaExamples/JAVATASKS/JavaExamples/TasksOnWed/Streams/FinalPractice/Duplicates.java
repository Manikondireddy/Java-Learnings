package JavaExamples.TasksOnWed.Streams.FinalPractice;


    import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> sum= Arrays.asList(21,13,25,67,89,20,30,90,30,90,21);
         List<Integer> summer= sum.stream()
          .distinct()
          .collect(Collectors.toList());
          System.out.println("remove duplicates :" + summer);
    }
    
}

    

