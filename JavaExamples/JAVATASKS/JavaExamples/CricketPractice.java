package JavaExamples;

import java.util.TreeSet;
import java.util.zip.CRC32C;

public class CricketPractice {

    private String cricketerName ;

    private int runs ;

    private double avg ;

    public CricketPractice(String cricketerName, int runs, double avg) {
        this.cricketerName = cricketerName;
        this.runs = runs;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "CricketPractice [cricketerName=" + cricketerName + ", runs=" + runs + ", avg=" + avg + "]";
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
public static void main(String[] args) {
    
    TreeSet<Cricket> set= new TreeSet<>() ;

    set.add(new Cricket("anil", 0, 0)) ;

    for (Cricket cricket : set) {

        System.out.println(cricket);
        
    }
}

    
}
