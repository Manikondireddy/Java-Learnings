package Cool.AccessModifiers.Inheritance;
class Fruit {
    Fruit() {
        System.out.println("Fruit");
    }

    void grow() {
        System.out.println("Fruit grows on a tree");
    }
}
class Citrus extends Fruit {
    Citrus() {
        super();
        System.out.println("Citrus");
    }

    void vitaminC() {
        System.out.println("Citrus is rich in Vitamin C");
    }
}
class Orange extends Citrus {
    Orange() {
        super();
        System.out.println("Orange");
    }

    void juice() {
        System.out.println("Orange is a tasty fruit");
    }
}
 class Fruits {
    public static void main(String[] args) {
        Orange o = new Orange();

        o.grow();
        o.vitaminC();
        o.juice();
    }
}

    

