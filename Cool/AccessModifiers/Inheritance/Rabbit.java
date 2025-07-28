package Cool.AccessModifiers.Inheritance;

public class Rabbit {
 
    void eat() {
        System.out.println("Rabbit looks so cute.");
    }

    void hop() {
        System.out.println("Rabbit is hopping.");
    }
}
class WildRabbit extends Rabbit {
    void hide() {
        System.out.println("Wild rabbit is hiding in the bushes.");
    }
}
class PetRabbit extends Rabbit {
    void cuddle() {
        System.out.println("Pet rabbit loves cuddles.");
    }
}
 class RabbitTest {
    public static void main(String[] args) {
        WildRabbit wild = new WildRabbit();
        wild.eat();
        wild.hop();
        wild.hide();

        System.out.println();

        PetRabbit pet = new PetRabbit();
        pet.eat();
        pet.hop();
        pet.cuddle();
    }
}
    

