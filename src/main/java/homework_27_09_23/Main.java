package homework_27_09_23;

public class Main {
    public static void main(String[] args) {

        LibraryManager libraryManager = new LibraryManager();
        Generator generator = new Generator();

        System.out.println("Формирование каталога книг" + libraryManager.setUpBooks());
        System.out.println("Формирование каталога пользователей: " + libraryManager.setUpUsers());
        System.out.println("Список доступных книг заданного жанра: " + libraryManager.listAvailableBooksByGenre(Genre.ROMAN));
        System.out.println("Список адресов электронной почты пользователей, зарезервировавших книги: " + libraryManager.listUserEmailsWithReservedBooks());
        libraryManager.addBookToLibrary(generator.getBookId(), generator.getBookTitle(), generator.getBookAuthor(), generator.getBookGenre(), generator.getBookYear(), generator.getBookAvailable());
        libraryManager.removeBookFromLibrary(false);
        libraryManager.borrowBook(generator.getUserName(), generator.getBookId(), generator.getBookTitle(), generator.getBookAuthor(), generator.getBookGenre(), generator.getBookYear(), generator.getBookAvailable());
        libraryManager.reserveBook(generator.getUserName(), generator.getBookId(), generator.getBookTitle(), generator.getBookAuthor(), generator.getBookGenre(), generator.getBookYear(), generator.getBookAvailable());


    }
}
