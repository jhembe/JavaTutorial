public class ISBN{
    // ISBNN 0 941831 39 6
    String isbn;
    public ISBN(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn() {
        // 0941831396
        return isbn.charAt(0)+" "+isbn.substring(1,7)+" "+isbn.substring(7,9)+" "+ isbn.charAt(9);
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}

