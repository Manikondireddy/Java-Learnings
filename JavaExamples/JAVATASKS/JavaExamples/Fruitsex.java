package JavaExamples;

import java.util.Vector;

public class Fruitsex {
    public static void main(String[] args) {
        Vector<String> fruit = new Vector<>();
        fruit.add("mango");
        fruit.add("apple");
        fruit.add("pineapple");
        fruit.add("guva");
        fruit.add("mango");
          System.out.println("Fruit: " + fruit);
          System.out.println("first fruit:" + fruit.get(0));
          fruit.remove(2);
          System.out.println("After removing " + fruit);
          fruit.set(2, "strawberry");
          System.out.println("After replacing" +fruit);
          for(String fruits:fruit){
          
            System.out.println(fruit);
            System.out.println("size of fruits:" +fruit.size());
          }

        }


    }
    


