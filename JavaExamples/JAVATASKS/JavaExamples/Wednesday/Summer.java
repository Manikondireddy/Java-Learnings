package JavaExamples.Wednesday;
interface Engine
{
    void car();
}
interface Motor
{
    void bike(); 
}
class Queue implements Engine,Motor{
  
    public void car()
    {
        System.out.println("car started ");
    }
    
    public void bike()
    {
        System.out.println("bike strted");
    }
}

public class Summer {
    public static void main(String[] args) {
        Queue a= new Queue();
        a.car();
        a.bike();
         

    }

    
}
