package JavaExamples.TUESDAY;

 public class Configuration {
    static String configvalue;
     static
     {
      
         configvalue="default_value345";
         System.out.println("static block created");
        
    }
    
 }
class animal{
     public static void main(String[] args) {
         System.out.println("configuration:" +Configuration.configvalue);
    }
}
