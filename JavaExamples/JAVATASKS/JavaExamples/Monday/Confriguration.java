package JavaExamples.Monday;

public class Confriguration {
    static String configvalue;
    static{
        configvalue="default_value_123";
        System.out.println("static block executed ");
    }
}
class Densa
{
    public static void main(String[] args) {
        System.out.println("Confriguration value :" + Confriguration.configvalue);
        
    }
}

    