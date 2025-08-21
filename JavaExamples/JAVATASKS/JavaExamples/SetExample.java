package JavaExamples;
    import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Mani");
        uniqueNames.add("Mouni");
        uniqueNames.add("Mini");
        uniqueNames.add("Mani");
        System.out.println("Unique Names: " + uniqueNames);
        System.out.println("Contains Mouni " + uniqueNames.contains("Mouni"));
        uniqueNames.remove("Mini");
        System.out.println("After removing Mini: " + uniqueNames);
        System.out.println("Iterating through elements:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
    

