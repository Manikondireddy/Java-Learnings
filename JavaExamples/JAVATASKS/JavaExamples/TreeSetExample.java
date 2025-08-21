package JavaExamples;
    import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Mahi");
        names.add("Mani");
        names.add("Madhu");
        names.add("Mahi"); 
        System.out.println("TreeSet: " + names); 
        System.out.println("Contains 'Madhu': " + names.contains("Madhu"));
        names.remove("Mani");
        System.out.println("TreeSet after removing Mani: " + names);
        System.out.println("Iterating through TreeSet:");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Ceiling of 'A': " + names.ceiling("A")); 
        System.out.println("Floor of 'B': " + names.floor("B")); 
    }
}
    

