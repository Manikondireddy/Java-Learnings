package Cool;

public class Ternaryoperasnullcheck {
   
    public static void main(String[] args) {
        User user = new User(null);
        String name = (user != null && user.getName() != null) ? user.getName() : "hello mani";
         System.out.println("How are you, " + name + "!"); 
    }
}
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
    

