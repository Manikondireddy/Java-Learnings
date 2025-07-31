package practiceOops;
    interface JokeInterface {
    static void tell() {
        System.out.println("Why don't  to tell to manager");
    }

    static void Pun() {
        System.out.println("Looking to good");
    }
}

public class Funnys {
    public static void main(String[] args) {
        System.out.println("Welcome to show");
        JokeInterface.tell();
        JokeInterface.Pun();

        System.out.println("Fun makes more laugh");
    }
}
    

