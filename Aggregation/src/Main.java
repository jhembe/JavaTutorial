public class Main {
    public static void main(String[] args) {
        // create two objects of Author and Book class
        Author author1 = new Author("Kapyela",65,"Maria");
        Author author2 = new Author("Martha",45,"Mark");

        Book book1 = new Book(34,"Madhara ya Shule",author1);
        Book book2 = new Book(34,"Power of Prayers",author2);
        // using the book object to call the show details method
        book1.showDetails();
        book2.showDetails();

    }
}