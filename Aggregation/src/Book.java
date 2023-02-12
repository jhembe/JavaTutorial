public class Book {
    // for it's instance varibles
    int bookId;
    String bookName;
    Author author;
    
    // for its instance variable
    public Book(int bookId,String bookName,Author author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }
    
    // create method show details
    public void showDetails(){
        System.out.print("*****************************");
        System.out.println("\nBook ID : "+ bookId +"\nBook Name : " + bookName);
        System.out.println("\nAuthor Name : " + author.authorName + "\nAuthor Age : " + author.authorAge);
        System.out.println("*****************************");
    }
}
