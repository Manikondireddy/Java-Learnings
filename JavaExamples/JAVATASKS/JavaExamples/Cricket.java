package JavaExamples;
import java.util.*;

public class Cricket {
    private String cricketerName;
    private int runs;
    private double average;

    public Cricket(String cricketerName, int runs, double average) {
        this.cricketerName = cricketerName;
        this.runs = runs;
        this.average = average;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public int getRuns() {
        return runs;
    }

    public double getAverage() 
    {
        return average;
    }

    @Override
    public String toString() {
        return cricketerName + " | Runs: " + runs + " | Avg: " + average;
    }

public static void main(String[] args) {
        Set<Cricket> players = new TreeSet<>();
        players.add(new Cricket("Sachin", 18, 444.83));
        players.add(new Cricket("Kohli", 13, 575.32));
        players.add(new Cricket("Dhoni", 10, 509.57));
        players.add(new Cricket("Kohli", 10, 580.00)); 
        
    }
}






    




    
    









