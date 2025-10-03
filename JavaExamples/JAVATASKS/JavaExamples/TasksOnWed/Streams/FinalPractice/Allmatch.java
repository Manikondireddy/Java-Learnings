package JavaExamples.TasksOnWed.Streams.FinalPractice;


    import java.util.Arrays;
import java.util.List;

public class Allmatch {
    public static void main(String[] args) {
        List<Integer> sum= Arrays.asList(12,33,44,98,56,45,32,21);
          boolean max = sum.stream()
                        .allMatch(n->n >0);
                        System.out.println("check all match  :" + max);

    }
}

    

