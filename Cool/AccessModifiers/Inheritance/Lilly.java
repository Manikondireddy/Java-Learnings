package Cool.AccessModifiers.Inheritance;
interface Medicinal {
    void heal();
}

interface Ornamental {
    void display();
}
public class Lilly implements Medicinal, Ornamental {
 public void heal() {
        System.out.println("The lilly has soothing");
    }
    public void display() {
        System.out.println("The lilly graces the garden");
    }

    public static void main(String[] args) {
        Lilly myLilly = new Lilly();
        myLilly.heal();
        myLilly.display();
    }
}
    
