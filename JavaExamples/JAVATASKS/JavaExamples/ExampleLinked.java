package JavaExamples;
import java.util.LinkedHashSet;

public class ExampleLinked {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Hyderabad");
        cities.add("banglore");
        cities.add("kerala");
        cities.add("chennai");
        cities.add("nodia");
        cities.add("mumbai");
        System.out.println("Cities : " + cities);
        System.out.println("first cities :" + cities.contains(cities));
        System.out.println("last cities :" + cities.contains(cities));
        System.out.println("check city exits :" + cities.contains("banglore"));
        System.out.println("check city exits:" + cities.contains("manglore"));
        cities.remove("nodia");
        System.out.println("After removing :" + cities);
        System.out.println("Iterating cities :");
        for(String citie: cities)
        {
            System.out.println(citie);
        }
        System.out.println("Total cities :" + cities.size());
    }
}
        