package practiceOops;
interface Sillycoffee {
    void makeCoffee();             
    void Empty();    
    void Drink(String drink);
}
class Funny implements Sillycoffee {
    public void makeCoffee() {
        System.out.println("Making coffee...");
    }

    public void Empty() {
        System.out.println(" No coffee");
    }

    public void Drink(String drink) {
        System.out.println("very brave!");
    }
}
public class Methods {
    public static void main(String[] args) {
        Funny myMachine = new Funny();
        myMachine.makeCoffee();
        myMachine.Empty();
        myMachine.Drink("Green Tea");
    }
}

    

