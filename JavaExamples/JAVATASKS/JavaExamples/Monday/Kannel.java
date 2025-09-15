package JavaExamples.Monday;
import java.util.HashSet;
import java.util.Set;

import JavaExamples.Hashset;;


public class Kannel {
    public static void main(String[] args) {
    HashSet<String> n= new HashSet<>();
    n.add("mani");
    n.add("mahi");
    n.add("mouni");
    n.add("medha");
    n.add("mouli");
    System.out.println("Set of elements in the set :" + n);
    System.out.println("before removing :" + n);
    n.remove("mouni");
    System.out.println("After removing :" + n);
        
    }

    
}
