package JavaExamples;

public class Referencevariable {
    String globalName = "I am a Global Reference Variable";
    public void show() {
        String localName = "I am a Local Reference Variable";
        System.out.println(localName); 
        System.out.println(globalName); 
    }

    public static void main(String[] args) {
        Referencevariable obj = new Referencevariable();
        obj.show();
        System.out.println(obj.globalName);
    }
}

    

