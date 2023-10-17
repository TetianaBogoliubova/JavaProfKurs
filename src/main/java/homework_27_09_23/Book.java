package homework_27_09_23;

public class Book {
    LibraryManager lm = new LibraryManager();
    private int bookId; //Уникальный идентификатор книги.
    private String bookTitle;//Название книги.
    private String bookAuthor;// Автор книги.
    private Genre bookGenre; //Жанр книги.
    private int bookYear; //Год издания книги.
    private boolean bookAvailable; //Доступность книги (true - доступна, false - не доступна).

    public Book() {
    }

    public Book(int bookId, String bookTitle, String bookAuthor, Genre bookGenre, int bookYear, boolean bookAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
        this.bookYear = bookYear;
        this.bookAvailable = bookAvailable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Genre getBookGenre() {
        return bookGenre;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public void setBookAvailable(boolean bookAvailable) {
        this.bookAvailable = bookAvailable;
    }

    public boolean isBookAvailable() {
        return bookAvailable;
    }

    public void setBookGenre(Genre bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookGenre='" + bookGenre + '\'' +
                ", bookYear=" + bookYear +
                ", bookAvailable=" + bookAvailable +
                '}';
    }
}
