package Cool.Operations.Switchstatements.Javainstanceoperator.Forloops;

public class Book {
    static String publisher = "Bird house";
    String title = "Untitled";
    int pages = 100;
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher);
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", 197);
        Book book2 = new Book("Atomic Habits", 320);

        book1.displayDetails();
        book2.displayDetails();
    }
}
    

