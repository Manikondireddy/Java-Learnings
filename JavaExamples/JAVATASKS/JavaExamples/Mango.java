package JavaExamples;

class A {
    private void showMessage() {
        System.out.println("Hello from class A");
    }

    public void callPrivate() {
        showMessage();
    }
}

class B extends A{
    public void Call() {
        System.out.println("Trying to call private ");
    }
}

public class Mango{
    public static void main(String[] args) {
        B obj = new B();
       obj.Call();
       obj.callPrivate();
        
    }

}

      









