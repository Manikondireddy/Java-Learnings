package JavaExamples;

import java.util.LinkedHashSet;

public class  {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Delhi");
        System.out.println("Cities in LinkedHashSet (insertion order): " + cities);
        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));
        System.out.println("Contains Chennai? " + cities.contains("Chennai"));
        cities.remove("Bangalore");
        System.out.println("After removing Bangalore: " + cities);
        System.out.println("Iterating LinkedHashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
        System.out.println("Total Cities: " + cities.size());
    }
}

    

