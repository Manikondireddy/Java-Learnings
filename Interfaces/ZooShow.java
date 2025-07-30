package Interfaces;
    interface Performer {
    void perform();
}

class D implements Performer {
    public void perform() {
        System.out.println("Dog is walking on the road");
    }
}

class C implements Performer {
    public void perform() {
        System.out.println(" Cat looks like cute");
    }
}

class P implements Performer {
    public void perform() {
        System.out.println("Parrot colour is green");
    }
}

public class ZooShow {
    public static void main(String[] args) {
        Performer[] M = {
            new D(),
            new C(),
            new P()
        };

        System.out.println("Welcome to the zooshow");

        for (Performer animal : M) {
            animal.perform();
        }

        System.out.println(" All performers are waiting for the show");
    }
}
    

