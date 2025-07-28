package Cool.AccessModifiers.Inheritance.Typcasting;
class Flower {
    void bloom() {
        System.out.println("The  flower is blooming");
    }
}

class Rose extends Flower {
    void fragrance() {
        System.out.println("Rose smells amazing!");
    }
 class Main {
    public static void main(String[] args) {
        Flower myFlower = new Rose(); 
        Rose myRose = (Rose) myFlower;
        myRose.fragrance();
    }
}
}

