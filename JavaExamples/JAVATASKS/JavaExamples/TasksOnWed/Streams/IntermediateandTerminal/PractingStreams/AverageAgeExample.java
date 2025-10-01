package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.*;
import java.util.stream.*;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
public int getAge() {
        return age;
    }
}

public class AverageAgeExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 35),
            new Person("David", 40)
        );
        double averageAge = people.stream()
                                  .mapToInt(Person::getAge)   
                                  .average()                 
                                  .orElse(0);               

        System.out.println("Average age: " + averageAge);
    }
}



