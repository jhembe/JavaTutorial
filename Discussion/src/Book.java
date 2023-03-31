import java.util.Scanner;

public class Book {
    String bookTitle;
    String author;
    String publisher;
    String city;
    String dateOfPublication;
    float price;
    ISBN isbnNum;

    public Book(String bookTitle,String author,String publisher,String city,String dateOfPublication,float price, ISBN isbnNum){
        this.author = author;
        this.bookTitle = bookTitle;
        this.publisher = publisher;
        this.city = city;
        this.dateOfPublication = dateOfPublication;
        this.price = price;
        this.isbnNum = isbnNum;
    }

    public String getAuthor() {
        return author;
    }

    public ISBN getIsbnNum() {
        return isbnNum;
    }
    void setBookIsbn(ISBN isbnNum){
        this.isbnNum = isbnNum;
    }
    void printDetails(){
        System.out.println("Book Title : " + bookTitle);
        System.out.println("Book Author : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("ISBN " + isbnNum.getIsbn());
    }

    public static void main(String[] args) {
        ISBN isbn1 = new ISBN("0941831396");
        Book book1 = new Book("Object First With Java","David j. Barnes and Michael Kolling","Prentice Hall","Dodoma",
                "20/1/1997",45000f,isbn1);
        book1.printDetails();

    }
}
