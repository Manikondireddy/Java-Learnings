package practiceOops;
 class SimpleStudent {
    String name;
    int age;
    String favoriteBook;
    SimpleStudent(String name, int age, String favoriteBook) {
        this.name = name;
        this.age = age;
        this.favoriteBook = favoriteBook;
    }
    void introduce() {
        System.out.println("Hi, I'm " + name + ". I'm " + age + " years old.");
    }
    void share() {
        System.out.println("My favorite book is \"" + favoriteBook + "\".");
    }
}

public class Zebra  {
    public static void main(String[] args) {
        SimpleStudent Mani = new SimpleStudent("Mani", 14, "Jungle Book");
        Mani.introduce();
        Mani.share();
    }
}
