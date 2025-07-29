package Interfaces;
interface Speake {
    void speak();
}
interface Calculator {
    int add(int a, int b);
}
class Smart implements Speake, Calculator {
    public void speak() {
        System.out.println("multiple interfaces");
    }

    public int add(int a, int b) {
        return a + b;
    }
}
  class Speaker{
    public static void main(String[] args) {
        Smart bot = new Smart();
        bot.speak();
        int result = bot.add(10, 5); 
        System.out.println("Calculation result: " + result);
    }
}

    

