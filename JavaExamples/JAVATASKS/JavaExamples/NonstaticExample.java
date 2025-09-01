package JavaExamples;

public class NonstaticExample {
    void add()
    {
        double pi=3.142;
        int r=5;
        double k=pi*r*r;
        System.out.println(k);
    }
    public static void main(String[] args) {
        
        new NonstaticExample().add();
    }
    
}
