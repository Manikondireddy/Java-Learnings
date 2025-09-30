package JavaExamples.TasksOnWed.Streams.IntermediateandTerminal.PractingStreams;

import java.util.Arrays;
import java.util.List;
 
class Person
{
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    } 
    public int getage()
    {
        return age;
    }
    public static void main(String[] args) {
        List<Object> name= Arrays.asList(
                        new Person("mani", 2),
                        new person("mini",3),
                        new person("mahi", 8));
          
                        
          double avg = name.stream()
                                  .flatMapToInt(Person::getAge)
                                  .average()
                                  .orElse(0); 

          System.out.println("average age :" + avg);
                     




        
    }
}


