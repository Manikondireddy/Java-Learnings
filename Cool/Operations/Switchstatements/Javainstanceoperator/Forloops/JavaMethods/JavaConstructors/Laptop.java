package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops.JavaMethods.JavaConstructors;


    public class Laptop {
    String brand;
    int ramSize;
    public Laptop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }

    public void showSpecs() {
        System.out.println("Brand: " + brand + ", RAM: " + ramSize + "GB");
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 16);
        Laptop l2 = new Laptop("HP", 8);

        l1.showSpecs();
        l2.showSpecs();
    }
}
    

