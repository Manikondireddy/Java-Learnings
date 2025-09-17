package JavaExamples.Wednesday;
import java.util.HashSet;

public class Remove {
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();
        set.add("megha ");
        set.add("mahi");
        set.add("megha");
        set.add("deva");
        set.add("megha");
        set.add("mini");
        set.add("mani");
        System.out.println("set in the list :" + set);
        set.remove("mahi");
        System.out.println("after removing in the set :" + set);

    }
    
}
