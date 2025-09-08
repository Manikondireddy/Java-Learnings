package JavaExamples;

import java.util.LinkedList;


public class Linkedlistexample {
    public static void main(String[] args) {
    LinkedList<String> task= new LinkedList<>();
    task.add("complete oops");
    task.add("revise oops");
    task.add("do more practice");
    task.add("good hardworking");
    System.out.println("task"  + task);
    System.out.println("first task :" + task.get(0));
    task.addFirst("Check emails");
        System.out.println("After Adding First Task: " + task);
        task.addLast("Update GitHub repo");
         System.out.println("After Adding Last Task: " + task);
     task.remove(2);
     System.out.println("After removing" + task);
    task.set(2,"practice more");
     System.out.println("After replacing :" + task);
     for(String tasks:task)
    {
        System.out.println(task);
        System.out.println("size of task :" + task.size());
          
    }

        
    }
}
    

