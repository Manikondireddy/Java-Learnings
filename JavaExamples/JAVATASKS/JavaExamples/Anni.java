package JavaExamples;
import java.util.HashSet;
import java.util.Set;

public class Anni {
    public static void main(String[] args) {
        HashSet<String> dent= new HashSet<>();
        dent.add("apple");
        dent.add("mango");
        dent.add("orange");
        dent.add("pineapple");
        dent.add("grapes");
        System.out.println("before removing :" + dent);
        dent.remove("grapes");
        System.out.println("after removing :" +dent);

    }

    
}
