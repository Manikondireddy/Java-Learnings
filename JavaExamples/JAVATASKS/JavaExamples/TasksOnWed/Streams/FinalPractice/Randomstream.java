package JavaExamples.TasksOnWed.Streams.FinalPractice;
    import java.util.Random;
import java.util.stream.IntStream;

public class Randomstream {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream randomInts = random.ints(10, 1, 100); 
        randomInts.forEach(System.out::println);
    }
}
    

