

import java.util.ArrayList;
public class Collections 
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruit= new ArrayList<>();
        fruit.add("Apple");
        fruit.add("pineapple");
        fruit.add("waterapple");
        fruit.add("Apple");
        System.out.println("fruits are healthy"  + "fruits");
        String firstFruit = fruit.get(0);
        System.out.println("First fruit " + firstFruit);
        fruit.set(1, "Grape");
        System.out.println("Fruits after modification: " + fruit);   
        fruit.remove("Apple");
         fruit.remove(0);
        System.out.println("Fruit after removing by index: " + fruit);
        fruit.remove(0); 
        System.out.println("Fruits after removing by index: " + fruit);
        int size = fruit.size();
        System.out.println("Number of fruits: " + size);
        System.out.println("Iterating through fruits:");
        for (String fruits : fruit) {
            System.out.println(fruit);
        }
        fruit.clear();
        System.out.println("Fruits after clearing: " + fruit);
    }
}
