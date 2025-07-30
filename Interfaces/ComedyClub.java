package Interfaces;
interface ComedyEligible {
    void performComedy();
}

class Peacock {
    String name;
    int funnyRating;

    Peacock(String name, int funnyRating) {
        this.name = name;
        this.funnyRating = funnyRating;
    }

    void enterClub() {
        if (funnyRating > 7) {
            System.out.println(name + " get in ");
        } else {
            System.out.println(name + " enough fun");
        }
    }
}

class Monkey extends Peacock implements ComedyEligible {
    Monkey(String name, int funnyRating) {
        super(name, funnyRating);
    }

    public void performComedy() {
        System.out.println(name + " Monkey eating banana");
    }
}

class Parrot extends Peacock implements ComedyEligible {
    Parrot(String name, int funnyRating) {
        super(name, funnyRating);
    }

    public void performComedy() {
        System.out.println(name + " parrot looking cute");
    }
}

public class ComedyClub {
    public static void main(String[] args) {
        Monkey chuckles = new Monkey("Chuckles", 9);
        Parrot mimzy = new Parrot("Mimzy", 6);

        chuckles.enterClub();
        chuckles.performComedy();

        mimzy.enterClub();
        mimzy.performComedy();
    }
}
    

