package JavaExamples;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        System.out.println("Colors in the set: " + colors);
        boolean containsGreen = colors.contains("Green");
        System.out.println("Does the set contain Green? " + containsGreen);
        colors.remove("Blue");
        System.out.println("Colors after removing Blue: " + colors);
        int size = colors.size();
        System.out.println("Size of the set: " + size);
        System.out.print("Iterating through colors: ");
        for (String color : colors) {
        System.out.print(color + " ");
        }
        System.out.println();
        colors.clear();
        System.out.println("Colors after clearing: " + colors); 
    }
}
    

