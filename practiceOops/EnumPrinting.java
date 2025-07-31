package practiceOops;

public class EnumPrinting {
    enum Fruit {
        APPLE, BANANA, ORANGE, MANGO
    }
    public static void main(String[] args) {
        System.out.println("Single fruit: " + Fruit.MANGO);
         System.out.println("\nAll fruits:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println("- " + fruit);
        }
         System.out.println("\nCustom toString output:");
        for (Fruit fruit : Fruit.values()) {
            System.out.println("- " + fruit.toString());
        }
    }
}
    

