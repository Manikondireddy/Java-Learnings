package JavaExamples.TasksOnWed.Streams;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        List<Integer> match= Arrays.asList(0,2,33,44,55,3,99,56);
        boolean matching = match.stream()
                          .allMatch(n->n >0);
                          System.out.println("finf all positives :" + matching );
    }
    
}
