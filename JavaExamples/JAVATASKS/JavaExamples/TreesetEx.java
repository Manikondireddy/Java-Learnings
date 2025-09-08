package JavaExamples;
import java.util.TreeSet;
import java.util.Set;

public class TreesetEx {
    public static void main(String[] args) {
        TreeSet<String> names= new TreeSet<>();
        names.add("dnee");
        names.add("canee");
        names.add("banee");
        names.add("eanee");
        names.add("anee");
        System.out.println("Names (Sorted) :" + names);
        System.out.println("first name :" + names.first());
        System.out.println("last name : " + names.last());
        names.remove("dnee");
        System.out.println("After removing : " + names);
        System.out.println("Iterating treeset :");
    
    for(String nam:names)
    {
        System.out.println(names);
    }
        System.out.println("final tree :" + names.size());
    }
}



