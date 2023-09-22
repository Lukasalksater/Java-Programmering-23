package ClassesTraining;

public class Book {
    String title;
    String author;
    int year;


    public static void main(String[] args) {
        
        Book book = new Book();
        System.out.println("The title of the book is " + book.title);
        System.out.println(book.author);
        System.out.println(book.year);
    }
}
