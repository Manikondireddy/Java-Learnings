package Cool.AccessModifiers.Inheritance;
interface Fragrant {
    void smell();
}
interface Beautiful {
    void admire();
}
public class Rose implements Fragrant, Beautiful {

    // @Override
    public void smell() {
        System.out.println("The rose smells sweet");
    }

    // @Override
    public void admire() {
        System.out.println("The rose looks stunning");
    }

    public static void main(String[] args) {
        Rose myRose = new Rose();
        myRose.smell();
        myRose.admire();
    }
}
    


